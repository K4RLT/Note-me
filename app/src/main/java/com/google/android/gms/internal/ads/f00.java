package com.google.android.gms.internal.ads;

import android.webkit.ConsoleMessage;

/* loaded from: classes.dex */
public abstract /* synthetic */ class f00 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f5875a;

    static {
        int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
        f5875a = iArr;
        try {
            iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f5875a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f5875a[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f5875a[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f5875a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
