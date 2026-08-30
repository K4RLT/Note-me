package mf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f20798a;

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f20799b;

    static {
        Charset forName = Charset.forName("UTF-8");
        forName.getClass();
        f20798a = forName;
        Charset.forName("UTF-16").getClass();
        Charset.forName("UTF-16BE").getClass();
        Charset.forName("UTF-16LE").getClass();
        Charset forName2 = Charset.forName("US-ASCII");
        forName2.getClass();
        f20799b = forName2;
        Charset.forName("ISO-8859-1").getClass();
    }
}
