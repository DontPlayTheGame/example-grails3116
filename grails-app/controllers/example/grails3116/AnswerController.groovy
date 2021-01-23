package example.grails3116

class AnswerController {
    def index() {}

    def doSomething() {
        flash.message = message(code: "question.mymessage", default: "Job done")
        redirect(controller: "home")
    }
}