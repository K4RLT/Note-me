package q7;

import com.daren.scraply.R;
import java.util.List;
import qe.m;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final h f23575a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f23576b;

    static {
        d dVar = d.TIP;
        f23575a = new h(100, 4, dVar, R.array.notify_onboard_titles, R.array.notify_onboard_bodies, R.array.notify_onboard_bodies);
        d dVar2 = d.REMINDER;
        f23576b = m.h(new h(1, 4, dVar2, R.array.notify_s1_titles, R.array.notify_s1_personal, R.array.notify_s1_generic), new h(2, 12, dVar, R.array.notify_s2_titles, R.array.notify_s2_personal, R.array.notify_s2_generic), new h(3, 30, dVar2, R.array.notify_s3_titles, R.array.notify_s3_personal, R.array.notify_s3_generic), new h(4, 60, dVar2, R.array.notify_s4_titles, R.array.notify_s4_personal, R.array.notify_s4_generic));
    }
}
