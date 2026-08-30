package b6;
import q.d;
import q.f;

import a6.w;
import android.text.TextUtils;
import com.google.android.gms.internal.mlkit_vision_digital_ink.pw;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import q.x;

/* loaded from: classes.dex */
public final class o {
    public static final String i = a6.f("WorkContinuationImpl");

    /* renamed from: a, reason: collision with root package name */
    public final r f1760a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1761b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1762c;

    /* renamed from: d, reason: collision with root package name */
    public final List f1763d;
    public final ArrayList e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f1764f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public boolean f1765g;

    /* renamed from: h, reason: collision with root package name */
    public pw f1766h;

    public o(r rVar, String str, int i10, List list) {
        this.f1760a = rVar;
        this.f1761b = str;
        this.f1762c = i10;
        this.f1763d = list;
        this.e = new ArrayList(list.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (i10 == 1 && ((a6.s) list.get(i11)).f291b.f18962u != Long.MAX_VALUE) {
                x.n("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
            String uuid = ((a6.s) list.get(i11)).f290a.toString();
            uuid.getClass();
            this.e.add(uuid);
            this.f1764f.add(uuid);
        }
    }

    public static HashSet b(o oVar) {
        HashSet hashSet = new HashSet();
        oVar.getClass();
        return hashSet;
    }

    public final w a() {
        if (!this.f1765g) {
            k6.e eVar = new k6.e(this);
            this.f1760a.f1775d.a(eVar);
            this.f1766h = eVar.f19557v;
        } else {
            a6.d().g(i, "Already enqueued work ids (" + TextUtils.join(", ", this.e) + ")");
        }
        return this.f1766h;
    }
}
