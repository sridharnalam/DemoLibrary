package com.ideahamster.demolibrary;

import java.util.Locale;

import io.reactivex.Observable;

/**
 * Created by Sridhar Nalam on 2020-01-23. version 1.0.0.1
 */
public class EntryPoint {
    private static EntryPoint sInstance;

    private EntryPoint() {
    }

    public static EntryPoint getInstance() {
        if (sInstance == null) {
            sInstance = new EntryPoint();
        }
        return sInstance;
    }

    public Observable<String> buildMyNewYearWishesObservable(int year) {
        return Observable.just(year)
                .map(this::wishThisYear);
    }

    public String buildMyNewYearWishes(int year) {
        return Observable.just(year)
                .map(this::wishThisYear)
                .blockingSingle();
    }

    private String wishThisYear(int year) {
        return String.format(Locale.ENGLISH, "Happy new year %d", year);
    }
}
