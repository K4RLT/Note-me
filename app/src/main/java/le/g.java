package le;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class g extends Exception {

    /* renamed from: w, reason: collision with root package name */
    public static final Pattern f20351w = Pattern.compile(".* \\(([^:]*):([0-9]+)\\)$");

    /* renamed from: u, reason: collision with root package name */
    public final int f20352u;

    /* renamed from: v, reason: collision with root package name */
    public final String f20353v;

    public g(int i, String str) {
        this.f20352u = i;
        this.f20353v = str;
    }
}
