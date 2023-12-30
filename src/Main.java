import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{

        // Создание плейлиста
        Playlist myPlaylist = new Playlist("Любимые треки", 3, 2);
        // Создание списка треков для плейлиста
        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(new Track("Кукушка", "Виктор Цой", 400, 1986, "рок",0));
        tracks.add(new Track("Метель", "Би-2", 345, 1998, "рок",0));
        tracks.add(new Track("Лето в городе", "Иван Дорн", 328, 2012, "поп",0));
        // Установка треков в плейлисте
        myPlaylist.setTracks(tracks);
        Album[] albumsArray = new Album[2];
        // Создание альбомов для плейлиста
        Album album1 = new Album("Несчастные люди", "ЛСП", 2023, 12, new ArrayList<>());
        ArrayList<Track> tracks1 = new ArrayList<>();
        // Добавление треков в первый альбом
        tracks1.add(new Track("Карантин", "ЛСП", 180, 2023, "поп хип-хоп",0));
        tracks1.add(new Track("Троянский конь", "ЛСП", 200, 2023, "поп хип-хоп",0));
        tracks1.add(new Track("Монополия", "ЛСП", 198, 2023, "поп хип-хоп",0));
        tracks1.add(new Track("Золотой ключик", "ЛСП", 222, 2023, "поп хип-хоп",0));
        tracks1.add(new Track("Несчастные люди", "ЛСП", 210, 2023, "поп хип-хоп",0));
        tracks1.add(new Track("Вечная весна", "ЛСП", 195, 2023, "поп хип-хоп",0));
        tracks1.add(new Track("Ураганы", "ЛСП", 189, 2023, "поп хип-хоп",0));
        tracks1.add(new Track("Не убежал", "ЛСП", 240, 2023, "поп хип-хоп",0));
        tracks1.add(new Track("Боди", "ЛСП", 200, 2023, "поп хип-хоп",0));
        tracks1.add(new Track("Сектор Приз", "ЛСП", 192, 2023, "поп хип-хоп",0));
        tracks1.add(new Track("Сикрет Плейс", "ЛСП", 203, 2023, "поп хип-хоп",0));
        tracks1.add(new Track("Стоп Игра", "ЛСП", 240, 2023, "поп хип-хоп",0));
        album1.setTracks(tracks1);
        albumsArray[0] = album1;
        // Создание списка альбомов для плейлиста
        ArrayList<Album> albums = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            // Добавление копий альбомов в список
            albums.add(new Album(albumsArray[i]));
        }
        // Установка альбомов в плейлисте
        myPlaylist.setAlbums(albums);
        // Создание альбомов для артиста и треков для них
        Album albumLsp1 = new Album("Magic City", "ЛСП", 2015, 9, new ArrayList<>());
        ArrayList<Track> tracksLsp1 = new ArrayList<>();
        tracksLsp1.add(new Track("Bullet", "ЛСП", 130, 2015, "рэп",521352));
        tracksLsp1.add(new Track("Что-то ещё", "ЛСП", 423, 2015, "рэп",538890));
        tracksLsp1.add(new Track("Шест", "ЛСП", 412, 2015, "рэп",1005321));
        tracksLsp1.add(new Track("Безумие", "ЛСП", 258, 2015, "рэп",2004322));
        tracksLsp1.add(new Track("Синее", "ЛСП", 258, 2015, "рэп",2412353));
        tracksLsp1.add(new Track("Фокус", "ЛСП", 258, 2015, "рэп",6231231));
        tracksLsp1.add(new Track("Бигги", "ЛСП", 258, 2015, "рэп",1432124));
        tracksLsp1.add(new Track("ОК", "ЛСП", 258, 2015, "рэп",9832234));
        tracksLsp1.add(new Track("Уровни", "ЛСП", 258, 2015, "рэп",2482945));
        albumLsp1.setTracks(tracksLsp1);
        Album albumLsp2 = new Album("Tragic City", "ЛСП", 2017, 10, new ArrayList<>());
        ArrayList<Track> tracksLsp2 = new ArrayList<>();
        tracksLsp2.add(new Track("Воскресение", "ЛСП", 130, 2015, "рэп",1829485));
        tracksLsp2.add(new Track("Монетка", "ЛСП", 423, 2015, "рэп",20294856));
        tracksLsp2.add(new Track("Тело", "ЛСП", 412, 2015, "рэп",19842374));
        tracksLsp2.add(new Track("Лабиринт отражений", "ЛСП", 258, 2015, "рэп",10384752));
        tracksLsp2.add(new Track("Конец света", "ЛСП", 258, 2015, "рэп",5382953));
        tracksLsp2.add(new Track("Белый танец", "ЛСП", 258, 2015, "рэп",8234344));
        tracksLsp2.add(new Track("Ещё один день", "ЛСП", 258, 2015, "рэп",7438224));
        tracksLsp2.add(new Track("Канкан", "ЛСП", 258, 2015, "рэп",11482954));
        tracksLsp2.add(new Track("Ползать", "ЛСП", 258, 2015, "рэп",9842450));
        tracksLsp2.add(new Track("Деньги не проблема", "ЛСП", 258, 2015, "рэп",13859432));
        albumLsp2.setTracks(tracksLsp2);
        ArrayList<Album> albumsLsp = new ArrayList<>();
        albumsLsp.add(albumLsp1);
        albumsLsp.add(albumLsp2);
        // Создание объекта Artist
        Artist myArtist = new Artist("ЛСП", 2);
        myArtist.setAlbums(albumsLsp);


        //Демонстрация работы программы


        //Создание плейлиста "Избранное"(Производный класс), в конструкторе вызывается конструктор базового класса
        Favorites favorites = new Favorites("Избранное", 3, 1);

        //Перегрузка метода базового класса
        favorites.AddTrack(tracks.get(0));

        //С вызовом метода базового
        favorites.CallBaseAddTrack(tracks.get(1));

        //Вывод
        System.out.print("Вывод альбома 'Избранное': ");
        System.out.println(favorites.toString());
        //Демонстрация работы абстрактного класса
        DisplayItem itemAlbum = albumLsp1;
        DisplayItem itemTrack = tracks.get(2);

        System.out.print("Демонстрация работы абстрактного класса: ");
        System.out.print("\n\nВывод альбома: ");
        itemAlbum.DisplayInfo();
        System.out.print("\nВывод трека: ");
        itemTrack.DisplayInfo();

        //Демонстрация работы интерфейсов
        TrackActions playlistTracks = myPlaylist;

        Track track = new Track("Лабиринт отражений", "ЛСП", 258, 2015, "рэп",10384752);
        playlistTracks.addTrack(track);
        playlistTracks.deleteTrack();
        System.out.print("Вывод плейлиста после добавления трека 'Лабиринт отражений' и удаления трека: ");
        System.out.println(myPlaylist.toString());

        //Демонстрация клонирования

        // Мелкое клонирование
        Album shallowCloneAlbum = (Album)albumLsp2.clone();
        System.out.print("Демонстрация мелкого клонирования: \n");
        albumLsp2.deleteTrack();
        System.out.print("После удаления трека из клона: ");
        System.out.println(shallowCloneAlbum.toString());
        // Глубокое клонирование
        Album deepCloneAlbum = albumLsp2.deepClone();
        System.out.print("Демонстрация глубокого клонирования: \n");
        albumLsp2.deleteTrack();
        System.out.print("После удаления трека из клона: ");
        System.out.println(shallowCloneAlbum.toString());
        //Демонстрация работы шаблонного класса
        System.out.print("Демонстрация работы шаблонного класса: ");
        ObjectList<Track> trackList = new ObjectList<>();;
        trackList.addObject(tracks.get(0));
        trackList.addObject(tracks.get(2));
        trackList.displayObjects();

        System.out.print("\n");

        ObjectList<Album> albumList = new ObjectList<>();
        albumList.addObject(albumLsp2);
        albumList.displayObjects();
    }
}