package jere.example.trafficsigns;

import java.util.ArrayList;

public class Array {
    public static ArrayList<ArrayModel> getDataSoal() {
        ArrayList<ArrayModel> list = new ArrayList<>();

        list.add(new ArrayModel(
                "larang berhenti",
                "larang parkir",
                "larang pejalan kaki",
                "larang putar balik",
                R.drawable.larangberhenti
        ));

        list.add(new ArrayModel(
                "larang putar balik",
                "larang pejalan kaki",
                "larang parkir",
                "larang berhenti",
                R.drawable.larangputarbalik
        ));

        list.add(new ArrayModel(
                "peringatan banyak pejalan kaki anak",
                "peringatan isyarat penyebrang jalan",
                "peringatan isyarat lalu lintas",
                "peringatan simpang empat",
                R.drawable.peringatanbanyakpejalankakianak
        ));
        list.add(new ArrayModel(
                "peringatan simpang empat",
                "peringatan isyarat lalu lintas",
                "peringatan isyarat penyebrang jalan",
                "peringatan banyak pejalan kaki anak",
                R.drawable.peringatansimpangempat
        ));
        list.add(new ArrayModel(
                "perintah belok kiri",
                "perintah jalur khusus motor",
                "perintah jalur pejalan kaki",
                "perintah mengikuti kearah kanan",
                R.drawable.perintahbelokkiri
        ));
        list.add(new ArrayModel(
                "perintah mengikuti kearah kanan",
                "perintah jalur pejalan kaki",
                "perintah jalur khusus motor",
                "perintah belok kiri",
                R.drawable.perintahmengikutikearahkanan
        ));
        list.add(new ArrayModel(
                "petunjuk arah",
                "petunjuk jarak",
                "petunjuk wisata",
                "petunjuk jalan tol",
                R.drawable.petunjukarah
        ));
        list.add(new ArrayModel(
                "petunjuk jarak",
                "petunjuk wisata",
                "petunjuk jalan tol",
                "petunjuk arah",
                R.drawable.petunjukjarak
        ));
        list.add(new ArrayModel(
                "perintah jalur khusus motor",
                "peringatan isyarat lalu lintas",
                "larang putar balik",
                "petunjuk jalan tol",
                R.drawable.perintahjalurkhususmotor
        ));
        list.add(new ArrayModel(
                "larang pejalan kaki",
                "perintah jalur pejalan kaki",
                "peringatan isyarat penyebrang jalan",
                "petunjuk jalan tol",
                R.drawable.larangpejalankaki
        ));
        return list;


    }
}
