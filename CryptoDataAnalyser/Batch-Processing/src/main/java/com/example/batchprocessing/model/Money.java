package com.example.batchprocessing.model;

import java.io.Serializable;
import java.util.Date;

public class Money implements Serializable {

        private int price;
        private int volume_24h;
        private int volume_change_24h;
        private int percent_change_1h;
        private int percent_change_24h;
        private int percent_change_7d;
        private int market_cap;
        private int market_cap_dominance;
        private double fully_diluted_market_cap;
        private Date last_updated;

        public int getPrice() {
                return price;
        }

        public void setPrice(int price) {
                this.price = price;
        }

        public int getVolume_24h() {
                return volume_24h;
        }

        public void setVolume_24h(int volume_24h) {
                this.volume_24h = volume_24h;
        }

        public int getVolume_change_24h() {
                return volume_change_24h;
        }

        public void setVolume_change_24h(int volume_change_24h) {
                this.volume_change_24h = volume_change_24h;
        }

        public int getPercent_change_1h() {
                return percent_change_1h;
        }

        public void setPercent_change_1h(int percent_change_1h) {
                this.percent_change_1h = percent_change_1h;
        }

        public int getPercent_change_24h() {
                return percent_change_24h;
        }

        public void setPercent_change_24h(int percent_change_24h) {
                this.percent_change_24h = percent_change_24h;
        }

        public int getPercent_change_7d() {
                return percent_change_7d;
        }

        public void setPercent_change_7d(int percent_change_7d) {
                this.percent_change_7d = percent_change_7d;
        }

        public int getMarket_cap() {
                return market_cap;
        }

        public void setMarket_cap(int market_cap) {
                this.market_cap = market_cap;
        }

        public int getMarket_cap_dominance() {
                return market_cap_dominance;
        }

        public void setMarket_cap_dominance(int market_cap_dominance) {
                this.market_cap_dominance = market_cap_dominance;
        }

        public double getFully_diluted_market_cap() {
                return fully_diluted_market_cap;
        }

        public void setFully_diluted_market_cap(double fully_diluted_market_cap) {
                this.fully_diluted_market_cap = fully_diluted_market_cap;
        }

        public Date getLast_updated() {
                return last_updated;
        }

        public void setLast_updated(Date last_updated) {
                this.last_updated = last_updated;
        }

        @Override
        public String toString() {
                return "Money{" +
                        "price=" + price +
                        ", volume_24h=" + volume_24h +
                        ", volume_change_24h=" + volume_change_24h +
                        ", percent_change_1h=" + percent_change_1h +
                        ", percent_change_24h=" + percent_change_24h +
                        ", percent_change_7d=" + percent_change_7d +
                        ", market_cap=" + market_cap +
                        ", market_cap_dominance=" + market_cap_dominance +
                        ", fully_diluted_market_cap=" + fully_diluted_market_cap +
                        ", last_updated=" + last_updated +
                        '}';
        }
}
