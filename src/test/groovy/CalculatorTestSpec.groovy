
/**
 * Created by yly289 on 4/15/16.
 */
class CalculatorTestSpec extends spock.lang.Specification{

    def "marks simple test"(){
        when: "mark says to do something"
            println("entring when")
            def balance = 200.00
            def cost = 5.00

        then:"the total should be 205.00"
            println("entring then")
            balance + cost == 205.00
    }

}
