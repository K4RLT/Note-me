package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class g31 extends an1 implements Serializable {
    public final Pattern O;

    public g31(Pattern pattern) {
        super(false);
        pattern.getClass();
        this.O = pattern;
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final String toString() {
        return this.O.toString();
    }
}
