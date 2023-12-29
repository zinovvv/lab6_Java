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
        Album album2 = new Album("Дух мира", "Джизус", 2023, 13, new ArrayList<>());
        ArrayList<Track> tracks2 = new ArrayList<>();
        // Добавление треков во второй альбом
        tracks2.add(new Track("Я голоден", "Джизус", 171, 2023, "альтернатива",0));
        tracks2.add(new Track("Едкий дым", "Джизус", 224, 2023, "альтернатива",0));
        tracks2.add(new Track("Маньяк", "Джизус", 161, 2023, "альтернатива",0));
        tracks2.add(new Track("Галактика", "Джизус", 330, 2023, "альтернатива",0));
        tracks2.add(new Track("Всё забрать", "Джизус", 239, 2023, "альтернатива",0));
        tracks2.add(new Track("Плавишься", "Джизус", 167, 2023, "альтернатива",0));
        tracks2.add(new Track("Ждал тебя", "Джизус", 225, 2023, "альтернатива",0));
        tracks2.add(new Track("Рай или Ад", "Джизус", 258, 2023, "альтернатива",0));
        tracks2.add(new Track("Spirit of the World", "Джизус", 217, 2023, "альтернатива",0));
        tracks2.add(new Track("Жвачка", "Джизус", 266, 2023, "альтернатива",0));
        tracks2.add(new Track("Заповедь", "Джизус", 100, 2023, "альтернатива",0));
        tracks2.add(new Track("Сигареты и творчество", "Джизус", 155, 2023, "альтернатива",0));
        tracks2.add(new Track("Каплей дождя", "Джизус", 238, 2023, "альтернатива",0));
        album2.setTracks(tracks2);
        albumsArray[0] = album1;
        albumsArray[1] = album2;
        // Создание списка альбомов для плейлиста
        ArrayList<Album> albums = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
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
        ArrayList<Track> tracksFavorites = new ArrayList<>();
        favorites.setTracks(tracksFavorites);
        ArrayList<Album> albumsFavorites = new ArrayList<>();
        favorites.setAlbums(albumsFavorites);

        //Перегрузка метода базового класса
        favorites.AddTrack(tracks.get(0));

        //С вызовом метода базового
        favorites.CallBaseAddTrack(tracks.get(1));

        //Вывод
        favorites.toString();

        //Демонстрация работы абстрактного класса
        DisplayItem itemAlbum = albumLsp1;
        DisplayItem itemTrack = tracks.get(2);

        itemAlbum.DisplayInfo();
        itemTrack.DisplayInfo();

        //Демонстрация работы интерфейсов
        TrackActions playlistTracks = myPlaylist;
        TrackActions favoritesTracks = favorites;
        AlbumActions artistAlbums = myArtist;

        Track track = new Track("Лабиринт отражений", "ЛСП", 258, 2015, "рэп",10384752);
        playlistTracks.addTrack(track);
        playlistTracks.deleteTrack();

        favoritesTracks.deleteTrack();

        artistAlbums.deleteAlbum();

        //Демонстрация клонирования

        // Мелкое клонирование
        Album shallowCloneAlbum = (Album)albumLsp2.clone();

        // Глубокое клонирование
        Album deepCloneAlbum = albumLsp2.deepClone();

        albumLsp2.deleteTrack();

        albumLsp2.toString();
        albumLsp2.toString();

        //Демонстрация работы шаблонного класса
        ObjectList<Track> trackList = new ObjectList<>();;
        trackList.addObject(tracks.get(0));
        trackList.addObject(tracks.get(2));
        trackList.displayObjects();

        ObjectList<Album> albumList = new ObjectList<>();
        albumList.addObject(albumLsp2);
        albumList.displayObjects();
    }
}