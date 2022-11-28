package com.portfolio.board.develop.exception;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Preconditions {

    public static void checkNotNull(final Object target) {
        if (target == null) {
            throw new NullPointerException();
        }
    }

}
