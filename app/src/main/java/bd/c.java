package bd;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import zc.g;

/* loaded from: classes.dex */
public final class c implements zc.f {

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f3198a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f3198a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // zc.a
    public final void a(Object obj, Object obj2) {
        ((g) obj2).b(f3198a.format((Date) obj));
    }
}
