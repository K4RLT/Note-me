package com.google.android.gms.ads.internal.adaptersettings;

import com.google.android.gms.internal.ads.ml;
import g9.r;

/* loaded from: classes.dex */
class AdapterSettings {
    private static volatile AdapterSettings instance;
    private final ml adapterSettingsInternal = r.e.f17699d;

    private boolean getBoolean(String str, boolean z3) {
        ml mlVar = this.adapterSettingsInternal;
        mlVar.getClass();
        if (!str.startsWith("adapter:")) {
            return z3;
        }
        return mlVar.f8371c.optBoolean(str, z3);
    }

    private float getFloat(String str, float f10) {
        ml mlVar = this.adapterSettingsInternal;
        mlVar.getClass();
        if (!str.startsWith("adapter:")) {
            return f10;
        }
        return (float) mlVar.f8371c.optDouble(str, f10);
    }

    public static AdapterSettings getInstance() {
        if (instance == null) {
            synchronized (AdapterSettings.class) {
                try {
                    if (instance == null) {
                        instance = new AdapterSettings();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    private int getInt(String str, int i) {
        ml mlVar = this.adapterSettingsInternal;
        mlVar.getClass();
        if (!str.startsWith("adapter:")) {
            return i;
        }
        return mlVar.f8371c.optInt(str, i);
    }

    private long getLong(String str, long j10) {
        ml mlVar = this.adapterSettingsInternal;
        mlVar.getClass();
        if (!str.startsWith("adapter:")) {
            return j10;
        }
        return mlVar.f8371c.optLong(str, j10);
    }

    private String getString(String str, String str2) {
        ml mlVar = this.adapterSettingsInternal;
        mlVar.getClass();
        if (!str.startsWith("adapter:")) {
            return str2;
        }
        return mlVar.f8371c.optString(str, str2);
    }
}
