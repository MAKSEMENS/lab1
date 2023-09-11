package com.cinema.kurs;

public class Session {
        private Movie movie;
        private int[] date = new int[3];
        private int time;
        private int count_of_sold;

        public Movie GetMovie() {
            return movie;
        }
        public void SetMovie(Movie newMovie) {
            movie = newMovie;
        }
        public int[] GetDate() {
            return date;
        }
        public void SetDirector(int[] newDirector) {
            date[0] = newDirector[0];
            date[1] = newDirector[1];
            date[2] = newDirector[2];
        }
        public int GetTime() {
            return time;
        }
        public void SetTime(int newTime) {
            time = newTime;
        }
        public int GetCount_Sold() {
            return count_of_sold;
        }
        public void SetCount_Sold(int newCount_Sold) {
            count_of_sold = newCount_Sold;
        }

}
