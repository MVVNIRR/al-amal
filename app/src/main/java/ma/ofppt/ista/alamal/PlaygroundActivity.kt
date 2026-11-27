package ma.ofppt.ista.alamal

import android.app.Notification
import android.os.Bundle

import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.ActionMode


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
//        val tglClim = findViewById<ToggleButton>(R.id.tglClim)
//        val swSilence = findViewById<MaterialSwitch>(R.id.swSilence)
//        val txtEtat = findViewById<TextView>(R.id.txtEtat)
// Android donne 2 valeurs, dans cet ordre :
//   bouton   = le ToggleButton qui vient de changer
//   estActif = true (allumé) ou false (éteint)
// On ne se sert pas de « bouton », mais on DOIT l'écrire : la 1re place
// reçoit toujours le bouton. Avec un seul nom, estActif recevrait le bouton
// et Kotlin refuserait de compiler.
//        tglClim.setOnCheckedChangeListener { bouton, estActif ->
//            if (estActif) {
//                txtEtat.text = "Climatisation allumée"
//            } else {
//                txtEtat.text = "Climatisation éteinte"
//            }
//        }
//// Même principe pour le Switch : bouton (non utilisé), puis estActif
//        swSilence.setOnCheckedChangeListener { bouton, estActif ->
//            if (estActif) {
//                txtEtat.text = "Mode silencieux : sonneries coupées"
//            } else {
//                txtEtat.text = "Mode silencieux désactivé"
//            }
//        }
//       val sp01=findViewById<Spinner>(R.id.spPoste)
//        val txtPoste = findViewById<TextView>(R.id.txtPoste)
//
//        sp01.onItemSelectedListener=object : AdapterView.OnItemSelectedListener{
//            override fun onItemSelected(
//                parent: AdapterView<*>?,
//                view: View?,
//                position: Int,
//                id: Long
//            ) {
//                val item=parent?.getItemAtPosition(position).toString()
//                txtPoste.text= "Poste choisi : $item"
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//                TODO("Not yet implemented")
//            }
//
//
//
//
//
//
//
//        }
//        val sp02=findViewById<Spinner>(R.id.spPosteCode)
//        val txt02=findViewById<TextView>(R.id.txtPosteCode)
//        val items1= mutableListOf<String>("Poste01","Poste02","Poste03")
//        val lstposteres=resources.getStringArray(R.array.s02_postes).toList()
//        val adapteur= ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,items1)
//        val adapteur2= ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,lstposteres)
//        sp02.adapter=adapteur
//        sp02.onItemSelectedListener=object: AdapterView.OnItemSelectedListener{
//            override fun onItemSelected(
//                parent: AdapterView<*>?,
//                view: View?,
//                position: Int,
//                id: Long
//            ) {
//                txt02.text=parent?.getItemAtPosition(position).toString()
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//                txt02.text="aucun poste choisie"
//            }
//
//        }
//        val btnVider=findViewById<Button>(R.id.btnVider)
//        btnVider.setOnClickListener{
//            adapteur.clear()
//        }


//
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//
//        menuInflater.inflate(R.menu.s02_menu_principal, menu)
//        return true
//    }
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        val t=findViewById<TextView>(R.id.txtMenu)
//        when(item.itemId){
//            R.id.menu_tarifs-> t.text="Les tarifs!!!"
//            R.id.menu_aide-> t.text="Appelez 071545484 pour l'aide"
//            R.id.menu_apropos-> t.text="Nous Sommes CyberCafe"
//            else->{
//                return super.onOptionsItemSelected(item)
//            }
//        }
//        return true
//    }
        val txtRes=findViewById<TextView>(R.id.txtResa)
        val txtacc=findViewById<TextView>(R.id.txtAction)
        txtRes.setOnLongClickListener {

            startSupportActionMode(ClassDeCallBack(txtRes,txtacc))
            true
        }
    }
    class ClassDeCallBack( val txtRes:TextView,val txtacc:TextView): ActionMode.Callback{
        override fun onActionItemClicked(
            mode: ActionMode?,
            item: MenuItem?
        ): Boolean {


            when(item?.itemId){
                    R.id.menu_aide-> txtacc.text="Selected:Aide"
                R.id.menu_apropos-> txtacc.text="Selected:A propos"
            }
            return true
        }

        override fun onCreateActionMode(
            mode: ActionMode?,
            menu: Menu?
        ): Boolean {
            mode?.menuInflater?.inflate(R.menu.s02_menu_principal, menu)
          return true
        }

        override fun onDestroyActionMode(mode: ActionMode?) {
            return
        }

        override fun onPrepareActionMode(
            mode: ActionMode?,
            menu: Menu?
        ): Boolean {
            return false
        }

    }





}
