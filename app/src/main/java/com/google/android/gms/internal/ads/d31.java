package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class d31 extends b31 {

    /* renamed from: v, reason: collision with root package name */
    public static final int f5299v = Integer.numberOfLeadingZeros(31);

    /* renamed from: w, reason: collision with root package name */
    public static final d31 f5300w = new b31("CharMatcher.whitespace()");

    @Override // com.google.android.gms.internal.ads.z21
    public final boolean a(char c10) {
        if ("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c10) >>> f5299v) == c10) {
            return true;
        }
        return false;
    }
}
