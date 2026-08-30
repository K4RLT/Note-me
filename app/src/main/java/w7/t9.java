package w7;
import p.a;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class t9 {

    /* renamed from: a, reason: collision with root package name */
    public final s9 f29155a;

    public t9(s9 s9Var) {
        s9Var.getClass();
        this.f29155a = s9Var;
    }

    public final boolean a() {
        return kotlin.jvm.internal.l.a(this.f29155a.e, "cloud");
    }

    public final boolean b() {
        if (!kotlin.jvm.internal.l.a(this.f29155a.e, "ondemand") && !a()) {
            return false;
        }
        return true;
    }

    public final int c() {
        boolean d2 = d();
        s9 s9Var = this.f29155a;
        if (d2) {
            return s9Var.f29087j.size();
        }
        if (f()) {
            return s9Var.f29089l.size();
        }
        return s9Var.i.size();
    }

    public final boolean d() {
        return !this.f29155a.f29087j.isEmpty();
    }

    public final String e() {
        return this.f29155a.f29080a;
    }

    public final boolean f() {
        return !this.f29155a.f29089l.isEmpty();
    }

    public final boolean g() {
        if (!this.f29155a.f29083d && !d() && !f()) {
            return true;
        }
        return false;
    }

    public final ArrayList h() {
        ma kaVar;
        s9 s9Var = this.f29155a;
        List<String> list = s9Var.i;
        ArrayList arrayList = new ArrayList(qe.m.d(list, 10));
        for (String str : list) {
            boolean b10 = b();
            String str2 = s9Var.f29080a;
            if (b10) {
                kaVar = new la(str2, str);
            } else {
                kaVar = new ka(a.l("stickers/", str2, "/", str));
            }
            arrayList.add(kaVar);
        }
        return arrayList;
    }
}
