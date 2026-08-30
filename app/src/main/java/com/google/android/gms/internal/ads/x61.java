package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class x61 implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f12473a;

    public x61(Pattern pattern) {
        pattern.getClass();
        this.f12473a = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.f12473a.matcher(str).matches();
    }
}
