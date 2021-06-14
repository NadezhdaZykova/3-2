package domain;

    public class Post {
        private int id;
        private int fromId;
        private int ownerId;
        private int date;
        private String text;
        private CommentsInfo commentsInfo;
        private int counterLikes;
        private int counterRepost;
        private int counterView;

        public void CommentsInfo() {
            int counter;
            \\
        }


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getOwnerId() {
            return ownerId;
        }

        public void setOwnerId(int ownerId) {
            this.ownerId = ownerId;
        }


        public int getFromId() {
            return fromId;
        }

        public void setFromId(int fromId) {
            this.fromId = fromId;
        }


        public int getDate() {
            return date;
        }

        public void setDate(int date) {
            this.date = date;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public ComentsInfo getCommentsInfo() {
            return commentsInfo;
        }

        public void setCommentsInfo(ComentsInfo commentsInfo) {
            this.commentsInfo = commentsInfo;
        }


        public int getCounterLikes() {
            return counterLikes;
        }

        public void setCounterLikes(int counterLikes) {
            this.counterLikes = counterLikes;
        }


        public int getCounterRepost() {
            return counterRepost;
        }

        public void setCounterRepost(int counterRepost) {
            this.counterRepost = counterRepost;
        }



        public int getCounterView() {
            return counterView;
        }

        public void setCounterView(int counterView) {
            this.counterView = counterView;
        }

    }
}
