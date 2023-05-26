package com.kiki.weaponguide.data

import com.kiki.weaponguide.R

object DataProvider {
    val Weapon  =
        weapon(
            id = 1,
            name = "M416",
            type = "Assault Rifles (AR)",
            ammo = "5.56mm",
            desc = "M416 adalah senapan serbu di game PUBG yang sangat populer karena" +
                    " memiliki akurasi yang baik, recoil yang rendah, dan dapat dilengkapi " +
                    "dengan berbagai attachment.",
            magazine = "30",
            reloadTime = "2.1s",
            image = R.drawable.m416
        )

    val WeaponList = listOf(
        Weapon,
        weapon(
            id = 2,
            name = "M762",
            type = "Assault Rifles (AR)",
            ammo = "7.62mm",
            desc = "M762 adalah senjata serbu kaliber 7,62mm yang tersedia dalam mode " +
                    "bertarung jarak menengah hingga jauh di PUBG Mobile. Senjata ini mempunyai " +
                    "damage per hit yang tinggi dan recoil yang kuat, sehingga diperlukan skill dalam " +
                    "menahan recoil saat menembak. M762 memiliki mode tembakan otomatis dan burst, namun mode " +
                    "burst tidak terlalu stabil dalam mengendalikan recoil.",
            magazine = "30",
            reloadTime = "2.1s",
            image = R.drawable.m762
        ),
        weapon(
            id = 3,
            name = "M249",
            type = "Light Machine Guns (LMGs)",
            ammo = "5.56mm",
            desc = "M249 adalah senapan mesin ringan yang tersedia di PUBG. Senjata ini " +
                    "menggunakan peluru kaliber 5.56mm dan memiliki kecepatan tembak yang tinggi. " +
                    "Namun jarak tembak dan akurasi sedikit menurun setelah menembak dalam jumlah " +
                    "peluru yang banyak. Senjata ini cocok digunakan untuk menembak musuh dalam jarak dekat hingga menengah.",
            magazine = "75",
            reloadTime = "8.2s",
            image = R.drawable.m429
        ),
        weapon(
            id = 4,
            name = "Kar98k",
            type = "Lever Action Sniper Rifles",
            ammo = "7.62mm",
            desc = "Kar98k adalah senapan bolt-action (laras tunggal dengan mekanisme bolt) " +
                    "yang tersedia di game PUBG. Senjata ini menggunakan amunisi 7.62mm dan dapat " +
                    "membunuh musuh dengan satu tembakan ke kepala atau badan. Kar98k memiliki jangkauan " +
                    "yang jauh dan akurasinya yang tinggi, sehingga cocok digunakan untuk menembak dari jarak jauh.",
            magazine = "5",
            reloadTime = "4.0s",
            image = R.drawable.kar98
        ),
        weapon(
            id = 5,
            name = "Thomson",
            type = "SubMachine Guns (SMGs)",
            ammo = ".45 ACP",
            desc = "Senjata Thomson di PUBG merupakan senjata submachine gun (SMG) yang cukup populer di game ini. " +
                    "Senjata ini menggunakan peluru kaliber .45 ACP dan memiliki rate of fire yang tinggi, namun damage " +
                    "per shot-nya tergolong sedang.</.",
            magazine = "30",
            reloadTime = "2.5s",
            image = R.drawable.thomson
        ),
        weapon(
            id = 6,
            name = "UZI",
            type = "SubMachine Guns (SMGs)",
            ammo = "9mm",
            desc = "UZI adalah senjata submachine gun yang dapat ditemukan di dalam game PUBG. " +
                    "Senjata ini memiliki kecepatan tembakan yang tinggi dan ringan sehingga mudah " +
                    "digunakan dalam jarak dekat atau pertempuran jarak menengah.",
            magazine = "25",
            reloadTime = "3.1s",
            image = R.drawable.uzi
        ),
        weapon(
            id = 7,
            name = "UMP45",
            type = "SubMachine Guns (SMGs)",
            ammo = ".45 ACP",
            desc = "UMP45 adalah senapan submachine yang dapat ditemukan di PUBG. Senjata ini " +
                    "menggunakan peluru 0.45 ACP dan biasanya ditemukan bersama dengan amunisi dan " +
                    "aksesori yang sesuai. UMP45 memiliki kecepatan tembak tinggi dan kecepatan proyektil " +
                    "yang cepat, serta kontrol yang baik pada jarak dekat dan sedang.",
            magazine = "25",
            reloadTime = "2.5s",
            image = R.drawable.ump45
        ),
        weapon(
            id = 8,
            name = "AWM",
            type = "Lever Action Sniper Rifles",
            ammo = ".300 Magnum",
            desc = "AWM (Arctic Warfare Magnum) adalah senapan runduk kelas berat yang tersedia di permainan PUBG. Senjata ini menggunakan peluru kaliber .300 Magnum yang sangat mematikan dan bisa membunuh musuh dengan satu tembakan di bagian tubuh manapun, kecuali bagian kaki dan lengan.",
            magazine = "5",
            reloadTime = "4.6s",
            image = R.drawable.awm
        ),
        weapon(
            id = 9,
            name = "VSS",
            type = "Automatic Sniper Rifles",
            ammo = "9mm",
            desc = "Senjata VSS (Vintovka Snayperskaya Specialnaya) adalah senapan sniper semi-otomatis yang dapat ditemukan di game PUBG. Senjata ini menggunakan peluru subsonik dan dilengkapi dengan built-in suppressor, yang membuatnya sangat efektif dalam situasi yang memerlukan ketenangan dan ketelitian, terutama dalam jarak dekat hingga menengah. ",
            magazine = "10",
            reloadTime = "4.0s",
            image = R.drawable.vss
        ),
        weapon(
            id = 10,
            name = "SKS",
            type = "Automatic Sniper Rifles",
            ammo = "7.62mm",
            desc = "SKS adalah senjata semi-otomatis di PUBG yang menggunakan amunisi kaliber 7.62mm. Senjata ini cocok untuk pertarungan jarak menengah dan memiliki tingkat kerusakan yang tinggi, namun dengan tingkat recoil (ketidakstabilan) yang sedang.",
            magazine = "10",
            reloadTime = "4.0s",
            image = R.drawable.sks
        )
    )
}