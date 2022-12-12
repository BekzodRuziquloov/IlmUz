package space.beka.findquickly.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sciences.*
import space.beka.findquickly.R
import space.beka.findquickly.adapter.ScienceAdapter
import space.beka.findquickly.adapter.SciencesAdapterCallBack
import space.beka.findquickly.models.QuizModel
import space.beka.findquickly.models.ScienceModel

class SciencesActivity : AppCompatActivity() {
    val sciences = listOf(
        ScienceModel("Matematika" , listOf(
            QuizModel(
                "15 ning kvadrati nechchi?",
                R.drawable.mathnew,
                "20",
                "225",
                "100",
                "1000",
                "B"
            ),
                    QuizModel(
                "16 ning kvadrati nechchi?",
                R.drawable.mathnew,
                "285",
                "125",
                "256",
                "126",
                "C"
            ),
                    QuizModel(
                "20 ning kvadrati nechchi?",
                R.drawable.mathnew,
                "400",
                "123",
                "300",
                "40",
                "A"
            )
              ,  QuizModel(
                "-126 ni -19 ga ayirganda javobni toping?",
                R.drawable.mathnew,
                "-145",
                "145",
                "-164",
                "41",
                "A"
            )
              ,  QuizModel(
                "25 ni 5 ga kopaytirgandagi kopaytmani toping?",
                R.drawable.mathnew,
                "20",
                "115",
                "125",
                "30",
                "C"
            ),
    QuizModel(
                "(122+32)/2  ning ayirmasi nechchi?",
                R.drawable.mathnew,
                "71",
                "81",
                "77",
                "67",
                "C"
            )  ,
    QuizModel(
                "12 ning kvadrati nechchi?",
                R.drawable.mathnew,
                "121",
                "144",
                "131",
                "199",
                "B"
            ) ,  QuizModel(
                "(6 * 8)*8 javobni toping?",
                R.drawable.mathnew,
                "135",
                "524",
                "185",
                "384",
                "D"
            ),  QuizModel(
                "(11 * 3) + 45 javobni toping?",
                R.drawable.mathnew,
                "42",
                "78",
                "33",
                "80",
                "B"
            ),  QuizModel(
                "14 * 24 javobni toping?",
                R.drawable.mathnew,
                "336",
                "532",
                "333",
                "426",
                "A"
            )
        )),
        ScienceModel("Ona tili", listOf(
            QuizModel(
            "Ona tili bu millatning ruhidir” Ushbu fikr kimga tegishli?",
            R.drawable.motherton,
            "I.A.Karimov",
            "Abdulla Avloniy ",
            "Alisher Navoiy",
            "K.Pautovskiy",
            "A"
        )
            ,  QuizModel(
                "kki yoki undan ortiq gapdan iborat birlik nima deyiladi?",
                R.drawable.motherton,
                "Sodda gap",
                "Qo'shma gap",
                "Ko'chirma gap",
                "Undalmali gap",
                "B"
            ),  QuizModel(
                "Qo'shma gaplar tasnifi qaysi qatorda to'liq berilgan?",
                R.drawable.motherton,
                "Bog'lovchisiz qo'shma gap",
                "Bog'langan qo'shma gap",
                "Ergashgan qo'shma gap",
                "Ayiruv munosabatli qo'shma gap",
                "C"
            ),  QuizModel(
                "Qaysi qatorda biriktiruv bog'lovchilari berilgan",
                R.drawable.motherton,
                "va, ham, hamda",
                "Goh..goh,dam..dam,ba'zan...ba'zan",
                "ammo,lekin ,biroq",
                "bilan ,uchun ,va ",
                "A"
            ),  QuizModel(
                "Undalma ishtirok etgan gap qaysi qatorda berilgan?",
                R.drawable.motherton,
                "Xonadagi jihozlarning barchasi:taxmon ,ko'rpacha,xontaxta,idish tovoqlar tartibsiz sochilib yotardi.",
                "Biz ,yoshlar yurt kelajagimiz ",
                "Hoy ,do'stim siz qayoqqa?",
                "Kuzgi dala ishlaridan horigan dehqonlarning birortasi ko'rinmaydi",
                "B"
            ),  QuizModel(
                "Bog'langan qo'shma gapni bog'lovchi vositalar qaysi qatorda to'g'ri ko'rsatilgan?",
                R.drawable.motherton,
                "teng va ergashtiruvchi bog'lovchilar ,ohang ",
                "Teng bog'lovchilar,bog'lovchi vazifasidagi so'zlar,ohang",
                "Teng bog'lovchilar ,yuklamalar",
                "Yuklamalar, ergashtiruvchi bog'lovchilar",
                "D"
            ),  QuizModel(
                "Qaysi qatorda gi gapda shevaga xos so'z berilgan?",
                R.drawable.motherton,
                "O'zbekiston Vatanim manim,",
                "Ikromjon o'ziga -o'zi beixtiyor gapirib borardi:yo'q shettan qayta qolay",
                "Buxoro- Sharq durdonasi ekanligini hamma biladi",
                "Xona yuzini har-xil qoliplar,charm parchalari tutib olgan edi.",
                "B"
            ),  QuizModel(
                "”Alpomish ”dostonining eng mukammal varianti qaysi baxshi tilidan yozib olingan?",
                R.drawable.motherton,
                "Fozil Yo'ldosh o'g'lidan",
                "Berdiyor baxshidan ",
                "Po'lkan shoirdan",
                ".Ergash Jumanbulbuldan",
                "В"
            ),  QuizModel(
                "bog'lovchi vazifasidagi vositalar qaysi qatorda berilgan?",
                R.drawable.motherton,
                "-u(-yu),-da,-ki",
                "bo'lsa ,esa, deb",
                "Shuning uchun shu sababli",
                "Barchasi",
                "C"
            ),  QuizModel(
                "Qaysi qatorda aniqlovchi uyushib kelgan?",
                R.drawable.motherton,
                "Iste'dodli adib ko'p asarlar va dramalar yozdi",
                "Undan sal nordon va shirin hid kelardi",
                "O'zbekiston yangicha taraqqiyot yo'lida",
                "Seni hur va ozod, seni kuylayman",
                "A"
            )
        )),
        ScienceModel("Adabiyot" , listOf(QuizModel(
            "“Bir toychoqning xuni”, “Galatepaga qaytish” asarlarining muallifini toping.",
            R.drawable.adabnew,
            "E.A’zam ",
        "X.Sulton",
        "T.Murod",
            "M.M.Do‘st",
            "A"
        )
            ,  QuizModel(
                "“Biz o’z muhabbatimiz bilan narsalarga go’zallik bag’ishlaymiz“ aforizmi muallifi kim?",
                R.drawable.adabnew,
                "Frans",
                "Dobrolyubov",
                "Tolstoy",
                "Pushkin",
                "A"
            )  ,  QuizModel(
                "““Devonu lug‘atit turk” asari qayerda yozilgan",
                R.drawable.adabnew,
                "Balosog‘unda",
                "Bag‘dodda",
                "Damashqda ",
                "Oltin O‘rdada",
                "C"
            )  ,  QuizModel(
                "“Devoni Nihoniy” qachon tuzildi?",
                R.drawable.adabnew,
                "1919",
                "1915",
                "1914",
                "1913",
                "D"
            )  ,  QuizModel(
                "“Martin Iden” romani muallifi kim?",
                R.drawable.adabnew,
                "J.London ",
                "J.Rodari",
                "U.Sayfiddin",
                "Tompson",
                "B"
            )  ,  QuizModel(
                "“Maydоn” rоmani muallifini aniqlang.",
                R.drawable.adabnew,
                "N.Eshоnqul",
                "О.Muхtоr",
                "A.Muхtоr",
                "L.Bo‘riхоn",
                "A"
            )  ,  QuizModel(
                "“Men va boshqalar” (Cho‘lpon) she’ri qaysi janrda yozilgan?",
                R.drawable.adabnew,
                "g‘azal ",
                "sonet",
                "to‘rtlik ",
                "oq she’r",
                "D"
            )  ,  QuizModel(
                "“Otalar xudosi” hikoyasi muallifi kim?",
                R.drawable.adabnew,
                "J.London",
                "J.Rodari",
                "U.Sayfiddin",
                "Tompson",
                "A"
            )  ,  QuizModel(
                "“Otoyining tug‘ilgan yili” asarining muallifi kim",
                R.drawable.adabnew,
                "E.A’zam",
                "X.Sulton",
                "T.Murod",
                "M.M.Do‘st",
                "D"
            )  ,  QuizModel(
                "“Qirq mil narida” hikoyasi muallifi kim?",
                R.drawable.adabnew,
                "J.London",
                "J.Rodari",
                "U.Sayfiddin",
                "Tompson",
                "B"
            ))),
        ScienceModel("Ingiliz tili", listOf(QuizModel(
            "A: What is _____ ?\n" +
                    "B: She is a bank manager",
            R.drawable.englishnew,
            " his job",
            "she job",
            " he job",
            "her job",
            "D"
        )
            ,
            QuizModel(
                "Why _____ you like _____ in the hotel?",
                R.drawable.englishnew,
                "do / working",
                "do / work",
                " does / working",
                "es / work",
                "A"
            ),

            QuizModel(
                "He always has _____ egg for breakfast.",
                R.drawable.englishnew,
                "an",
                "a",
                "any",
                "the",
                "A"
            ),
            QuizModel(
                "Do you like _____ homework ?",
                R.drawable.englishnew,
                " making",
                "do",
                "doing",
                "does",
                "C"
            ),
            QuizModel(
                "_____ you ever _____ in a car accident?",
                R.drawable.englishnew,
                "Has / been",
                "Have / been",
                "Have / be",
                "Have / was",
                "B"
            ),
            QuizModel(
                "Oxford is one of ___ oldest universities in Europe",
                R.drawable.englishnew,
                "the",
                "*",
                "much",
                "more",
                "A"
            ),
            QuizModel(
                "She had a car crash, but she was _____ to escape with no injuries at all",
                R.drawable.englishnew,
                "depressed",
                "romantic",
                "lucky",
                "healthy",
                "C"
            ),
            QuizModel(
                "_____ to a rock concert?",
                R.drawable.englishnew,
                "Were you ever go",
                "Have you ever been",
                "Do you ever go",
                "Have you ever go",
                "B"
            ),
            QuizModel(
                "I love rock and roll. I _____ it all my life",
                R.drawable.englishnew,
                " am liking",
                "like",
                "liking",
                "have liked",
                "D"
            ),
            QuizModel(
                "I cook food for a restaurant. I’m a(n) _____.",
                R.drawable.englishnew,
                "chef",
                "musician",
                "uncle",
                "professor",
                "A"
            ),),),
        ScienceModel("Kimyo" , listOf(QuizModel(
            "Novshadil spirtini formulasiтш belgilang. ",
            R.drawable.kimyonew,
            "NH4C1",
            "(NK4)2CO3 ",
            "NH4OH ",
            "NH4HCO3",
            "B"

        )
            ,QuizModel(
                "Bir xil molekulalaming ketma-ket yanada yirik molekulalar hosil qilib birikish reaksiyasi nima deyiladi? ",
                R.drawable.kimyonew,
                "Polimerlanish ",
                "Makromolekula",
                "monomerlar ",
                "to'g'.jav.yo’q",
                "A"

            ),QuizModel(
                "Atom tuzilishi quyidagicha bo'lgan qaysi elementning metallik xossalari kuchli ifodalangan?",
                R.drawable.kimyonew,
                "...2s';",
                "...3s';",
                "...4s';",
                "...5s';",
                "C"

            ),QuizModel(
                "Qaysi elementning metallmaslik xossalari kuchliroq?",
                R.drawable.kimyonew,
                "S;",
                "F;",
                "Si;",
                "N;",
                "D"

            ),QuizModel(
                "NH4Cl molekulasida qanday bog'lar mavjud?",
                R.drawable.kimyonew,
                "3 ta kovalent va 2 ta ion;  ",
                "2 ta vodorod va 3 ta ion; ",
                "3 ta ion va 2 ta kovalent",
                "3 ta vodorod va 3 ta ion; ",
                "D"

            ),QuizModel(
                " Qaysi reaksiya oddiy sharoitda boradi?",
                R.drawable.kimyonew,
                "Cl2 + H2 -»",
                "Na + Cl2 -»",
                "Cu + Cl2 -»",
                "Fe + Cl2 -»",
                "B"

            ),QuizModel(
                "Qaysi guruh elementlarining elektrmanfiyligi kuchli?",
                R.drawable.kimyonew,
                " Li, K, Na; ",
                "Mg, Ca, Ba;",
                "B, Al, Cu; ",
                "F, Cl, Br;",
                "C"

            ),QuizModel(
                "72 g suv elektr toki ta'sirida parchalanganda qancha miqdor vodorod hosil bo'ladi?",
                null,
                "2 ",
                "3",
                "5 ",
                "4",
                "D"

            ),QuizModel(
                "Quyidagilardan qaysi bin tabiatda eng barqaror vodorodii birikma ekanligini ko'rsating.",
                null,
                "CaH2;",
                "H2S;",
                "K2Se;",
                " H2Te;",
                "C"

            )))
    )
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sciences)
        rv.adapter = ScienceAdapter(sciences , object :SciencesAdapterCallBack{
            override fun onClick(items: ScienceModel) {

                    val intent = Intent(this@SciencesActivity, QuziActivity::class.java)
                    intent.putExtra("extra", items)
                    startActivity(intent)

            }
        })

        imageBack.setOnClickListener {
            finish()
        }
    }
}