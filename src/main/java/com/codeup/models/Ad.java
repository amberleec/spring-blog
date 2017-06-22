package com.codeup.models;

/**
 * Created by Amberlee on 6/22/17.
 */
public class Ad {
    public Ad() {

    }

    public class Ad {
        private long id;
        private String title;
        private String description;

        public Ad(long id, String title, String description) {
            this.id = id;
            this.title = title;
            this.description = description;
        }

        public Ad() {
        }

        public Ad(String title, String description) {
            this.title = title;
            this.description = description;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
