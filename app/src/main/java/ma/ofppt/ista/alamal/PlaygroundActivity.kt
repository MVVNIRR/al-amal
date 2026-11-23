package ma.ofppt.ista.alamal

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.materialswitch.MaterialSwitch

// MODE COURS (Playground) : écran VIDE pour tester en direct les exemples montrés en cours.
// Écrivez le layout dans res/layout/activity_playground.xml et le code Kotlin ci-dessous, dans onCreate.
class PlaygroundActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playground)

//        val img= findViewById<ImageView>(R.id.imgLogo)
//        val txt= findViewById<TextView>(R.id.txtInfo)
//
//        img.setOnClickListener {
//            txt.text ="8 postes,Imprimante et scanner"
//        }


        //    var numcom=1
//    var prix=0
//    fun commanderCafe(v: View) {
//
//            numcom++
//            prix+=5
//            val txtCommande = findViewById<TextView>(R.id.txtCommande)
//            txtCommande.text = "Cafe Commander n°$numcom ($prix DH)"
//
//    }


//        val btnImprimer = findViewById<Button>(R.id.btnImprimer)
//        val txtPages = findViewById<TextView>(R.id.txtPages)
//        var prix =0
//        var numpage=0
//        btnImprimer.setOnClickListener {
//            prix+=2
//            numpage++
//            txtPages.text = "$numpage pages(s): $prix DH"
//        }
//        var numclient=0
//        val fabNouveau = findViewById<View>(R.id.fabNouveau)
//        fabNouveau.setOnClickListener {
//
//            numclient++
//            txtClients.text=" clients present :$numclient"
//    }
//        val btnEntrer = findViewById<Button>(R.id.btnEntrer)
//        val txtSalut = findViewById<TextView>(R.id.txtSalut)
//        val edtPrenom = findViewById<TextView>(R.id.edtPrenom)
//        btnEntrer.setOnClickListener {
//            if (edtPrenom.text.toString().isNotEmpty())  {
//                txtSalut.text="Bienvenue ${edtPrenom.text}"
//
//
//            }else{
//                edtPrenom.error="Entrer votre prenom"
//            }
//
//        }
//        val fabNouveau = findViewById<View>(R.id.fabNouveau)
//        fabNouveau.setOnClickListener {
//
//            txtSalut.text=""
//            edtPrenom.text=null
//            edtPrenom.error=null
//        }

//        val btnTotal = findViewById<Button>(R.id.btnTotal)
//        val txtTotal = findViewById<TextView>(R.id.txtTotal)
//        val imp = findViewById<CheckBox>(R.id.chkImpression)
//        val casq = findViewById<CheckBox>(R.id.chkCasque)
//        val scan = findViewById<CheckBox>(R.id.chkScanner)
//
//        btnTotal.setOnClickListener {
//            var prix = 0
//            var options = 0
//            if (imp.isChecked) {
//                prix += 2
//                options++
//            }
//            if (casq.isChecked) {
//                prix += 2
//                options++
//            }
//            if (scan.isChecked) {
//                prix += 2
//                options++
//            }
//
//            txtTotal.text = " $options options: $prix DH"
//        }
        // Étape 3 — réagir au ToggleButton et au Switch
        val tglClim = findViewById<ToggleButton>(R.id.tglClim)
        val swSilence = findViewById<MaterialSwitch>(R.id.swSilence)
        val txtEtat = findViewById<TextView>(R.id.txtEtat)
// Android donne 2 valeurs, dans cet ordre :
//   bouton   = le ToggleButton qui vient de changer
//   estActif = true (allumé) ou false (éteint)
// On ne se sert pas de « bouton », mais on DOIT l'écrire : la 1re place
// reçoit toujours le bouton. Avec un seul nom, estActif recevrait le bouton
// et Kotlin refuserait de compiler.
        tglClim.setOnCheckedChangeListener { bouton, estActif ->
            if (estActif) {
                txtEtat.text = "Climatisation allumée"
            } else {
                txtEtat.text = "Climatisation éteinte"
            }
        }
// Même principe pour le Switch : bouton (non utilisé), puis estActif
        swSilence.setOnCheckedChangeListener { bouton, estActif ->
            if (estActif) {
                txtEtat.text = "Mode silencieux : sonneries coupées"
            } else {
                txtEtat.text = "Mode silencieux désactivé"
            }
        }
    }

}
