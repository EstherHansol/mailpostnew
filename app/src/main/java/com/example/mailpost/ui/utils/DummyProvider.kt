package com.example.mailpost.ui.utils

import com.example.mailpost.model.Comment
import com.example.mailpost.model.Letter

    var cnt = -1
    var pubcnt = -1
    var pub = false

    var titleList = Array(10,{""})
    var contentList = Array(10,{""})
    var fromList = Array(10,{""})
    var toList = Array(10,{""})


    //public
    var ptitleList = Array(10,{""})
    var pcontentList = Array(10,{""})
    var pfromList = Array(10,{""})
    var ptoList = Array(10,{""})



//비공개편지
fun providePrivateLetters(): List<Letter> {

    val letterList = mutableListOf<Letter>()

    val firstDummyLetter = Letter(
        "뽀삐야, 보고싶어.",
        "하늘 나라에서도 잘 지내고 있는거지?",
        "민지",
        "뽀삐",
        listOf(Comment(0, 0, "", System.currentTimeMillis()),
            Comment(0, 0, "", System.currentTimeMillis()),
            Comment(0, 0, "", System.currentTimeMillis()))
    )

    val secondDummyLetter = Letter(
        "내일의 나에게.",
        "내일도 편지 한 통 쓰자!",
        "민지",
        "스스로",
    )

    val thirdDummyLetter = Letter(
        "성남 초등학교 오성태!!",
        "어릴 때 같이 놀이터에서 많이 놀았었는데 요즘엔 뭐하는지 궁금하네. 글 보면 연락 줘!",
        "민지",
        "성태",
        listOf(Comment(0, 0, "", System.currentTimeMillis()),
            Comment(0, 0, "", System.currentTimeMillis()))
    )

    letterList.addAll(listOf(firstDummyLetter, secondDummyLetter, thirdDummyLetter))



    if(cnt != -1 && titleList[cnt].isNotEmpty()) {
        for(i in 0 .. cnt) {
            letterList.add(Letter(titleList[i], contentList[i], fromList[i], toList[i]))
        }
    }

    return letterList
}



//공개편지
fun providePublicLetters(): List<Letter> {

    val letterList = mutableListOf<Letter>()

    val DummyLetter1 = Letter(
        "뽀삐야, 보고싶어.",
        "하늘 나라에서도 잘 지내고 있는거지?",
        "민지",
        "뽀삐",
        listOf(Comment(0, 0, "", System.currentTimeMillis()),
            Comment(0, 0, "", System.currentTimeMillis()),
            Comment(0, 0, "", System.currentTimeMillis()))
    )

    val DummyLetter2 = Letter(
        "김병장님",
        "전역하셨으니 하는 말인데 그리 살지 마십쇼",
        "곽철우",
        "김찬호",
        listOf(Comment(0, 0, "", System.currentTimeMillis()),
            Comment(0, 0, "", System.currentTimeMillis()))
    )

    val DummyLetter3 = Letter(
        "내일의 나에게.",
        "내일도 편지 한 통 쓰자!",
        "민지",
        "스스로",
    )

    val DummyLetter4 = Letter(
        "먼저간남편께",
        "왜이러케빨리갓소보고싶어요",
        "김춘자",
        "김판호",
        listOf(Comment(0, 0, "", System.currentTimeMillis()),
            Comment(0, 0, "", System.currentTimeMillis()),
            Comment(0, 0, "", System.currentTimeMillis()))
    )

    val DummyLetter5 = Letter(
        "성남 초등학교 오성태!!",
        "어릴 때 같이 놀이터에서 많이 놀았었는데 요즘엔 뭐하는지 궁금하네. 글 보면 연락 줘!",
        "민지",
        "성태",
        listOf(Comment(0, 0, "", System.currentTimeMillis()),
            Comment(0, 0, "", System.currentTimeMillis()))
    )

    val DummyLetter6 = Letter(
        "I miss you, John",
        "I'm sad that we can't meet because *ucking COVID-19. ",
        "제시카 초이",
        "존 존스",
        listOf(Comment(0, 0, "", System.currentTimeMillis()),
                Comment(0, 0, "", System.currentTimeMillis()),
            Comment(0, 0, "", System.currentTimeMillis()))
    )

    val DummyLetter7 = Letter(
        "도라에몽 잘 지내니?",
        "나 다음 달에 이슬이랑 결혼해. 니가 왔으면 좋겠는데..",
        "노진구",
        "도라에몽",
        listOf(Comment(0, 0, "", System.currentTimeMillis()),
            Comment(0, 0, "", System.currentTimeMillis()))
    )
    val DummyLetter8 = Letter(
        "티라노사우르스야 아쉽구나",
        "몇 억년만 일찍 태어나면 우리 만날 수 있었을 텐데.. ",
        "김디아나존스",
        "티라노사우르스",
        listOf(Comment(0, 0, "", System.currentTimeMillis()),
            Comment(0, 0, "", System.currentTimeMillis()),
            Comment(0, 0, "", System.currentTimeMillis()),
            Comment(0, 0, "", System.currentTimeMillis()),
            Comment(0, 0, "", System.currentTimeMillis()))
    )


    letterList.addAll(listOf(DummyLetter1, DummyLetter2, DummyLetter3, DummyLetter4, DummyLetter5, DummyLetter6, DummyLetter7, DummyLetter8))



    if(pubcnt != -1 && ptitleList[pubcnt].isNotEmpty()) {
        for(i in 0 .. pubcnt) {
            letterList.add(Letter(ptitleList[i], pcontentList[i], pfromList[i], ptoList[i]))
        }
    }

    return letterList
}
