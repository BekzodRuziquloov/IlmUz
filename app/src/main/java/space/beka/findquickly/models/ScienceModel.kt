package space.beka.findquickly.models

data class ScienceModel (
    val title:String,
    val quizList: List<QuizModel>
        ):java.io.Serializable
data class QuizModel(
    val title:String,
    val image:Int?,
    val answerA:String,
    val answerB:String,
    val answerC:String,
    val answerD:String,
    val correctAnswer:String
):java.io.Serializable