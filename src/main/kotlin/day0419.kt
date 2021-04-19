fun main(){
    println("== 프로그램 시작 ==")
    println("2개의 숫자를 입력받습니다.")
    print("1번째 숫자:")
    val numb1 = readLine()!!.trim().toInt()
    print("2번째 숫자:")
    val numb2 = readLine()!!.trim().toInt()

    val numb3 = numb1 + numb2
    print("""입력하신 숫자의 총 합은 ${numb3} 입니다.""", )

    println("== 프로그램 종료 ==")

}



