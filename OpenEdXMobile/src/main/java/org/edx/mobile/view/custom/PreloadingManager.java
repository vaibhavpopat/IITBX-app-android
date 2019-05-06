package org.edx.mobile.view.custom;

import android.support.annotation.NonNull;

public interface PreloadingManager {
    enum State {
        DEFAULT, MAIN_UNIT_LOADING, MAIN_UNIT_LOADED
    }

    void setLoadingState(@NonNull State newState);

    boolean isMainUnitLoaded();
}
