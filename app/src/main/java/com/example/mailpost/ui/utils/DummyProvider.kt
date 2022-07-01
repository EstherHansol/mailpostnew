package com.example.mailpost.ui.utils

import com.example.mailpost.model.Comment
import com.example.mailpost.model.Letter

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

    return letterList
}