package g5;
import x.o;
import a0.j0;
import c.f0;
import m.d;
import m.i;
import q.x;
import x.b;
import z.a;

import android.os.Looper;
import com.google.android.gms.internal.mlkit_vision_digital_ink.pw;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import wa.e8;
import ya.n9;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public uf.c f17535a;

    /* renamed from: b, reason: collision with root package name */
    public te.g f17536b;

    /* renamed from: c, reason: collision with root package name */
    public Executor f17537c;

    /* renamed from: d, reason: collision with root package name */
    public d0 f17538d;
    public p e;

    /* renamed from: f, reason: collision with root package name */
    public f f17539f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17541h;

    /* renamed from: g, reason: collision with root package name */
    public final pw f17540g = new pw(new f0(0, this, v.class, "onClosed", "onClosed()V", 0, 3));
    public final ThreadLocal i = new ThreadLocal();

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f17542j = new LinkedHashMap();

    /* renamed from: k, reason: collision with root package name */
    public boolean f17543k = true;

    public final void a() {
        boolean z3;
        if (!this.f17541h) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                return;
            }
            x.o("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        c0 c0Var;
        if (q() && !r()) {
            te.g gVar = (te.g) this.i.get();
            if (gVar != null) {
                c0Var = (c0) gVar.L(c0.f17425v);
            } else {
                c0Var = null;
            }
            if (c0Var != null) {
                x.o("Cannot access database on a different coroutine context inherited from a suspending transaction.");
            }
        }
    }

    public final void c() {
        a();
        a();
        r5.c y10 = k().y();
        if (!y10.J()) {
            e8.a(new j0(j(), null, 8));
        }
        if (y10.f24554u.isWriteAheadLoggingEnabled()) {
            y10.j();
        } else {
            y10.f();
        }
    }

    public List d(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(qe.b(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            kotlin.jvm.internal.e eVar = (kotlin.jvm.internal.e) entry.getKey();
            eVar.getClass();
            Class a10 = eVar.a();
            a10.getClass();
            linkedHashMap2.put(a10, entry.getValue());
        }
        return i(linkedHashMap2);
    }

    public abstract f e();

    public c4.g f() {
        throw new pe.i(0);
    }

    public q5.b g(a aVar) {
        aVar.getClass();
        throw new pe.i(0);
    }

    public final void h() {
        k().y().m();
        if (!r()) {
            f j10 = j();
            j10.f17438b.e(j10.e, j10.f17441f);
        }
    }

    public List i(LinkedHashMap linkedHashMap) {
        return qe.s.f24023u;
    }

    public final f j() {
        f fVar = this.f17539f;
        if (fVar != null) {
            return fVar;
        }
        kotlin.jvm.internal.l.h("internalTracker");
        throw null;
    }

    public final q5.b k() {
        p pVar = this.e;
        if (pVar != null) {
            q5.b bVar = pVar.f17511g;
            if (bVar != null) {
                return bVar;
            }
            x.o("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
            return null;
        }
        kotlin.jvm.internal.l.h("connectionManager");
        throw null;
    }

    public final te.g l() {
        uf.c cVar = this.f17535a;
        if (cVar != null) {
            return cVar.f27210u;
        }
        kotlin.jvm.internal.l.h("coroutineScope");
        throw null;
    }

    public Set m() {
        Set<Class> n10 = n();
        ArrayList arrayList = new ArrayList(qe.d(n10, 10));
        for (Class cls : n10) {
            cls.getClass();
            arrayList.add(kotlin.jvm.internal.a(cls));
        }
        return qe.l.U(arrayList);
    }

    public Set n() {
        return qe.u.f24025u;
    }

    public LinkedHashMap o() {
        Set<Map.Entry> entrySet = p().entrySet();
        int b10 = qe.b(qe.d(entrySet, 10));
        if (b10 < 16) {
            b10 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b10);
        for (Map.Entry entry : entrySet) {
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            cls.getClass();
            kotlin.jvm.internal.e a10 = kotlin.jvm.internal.a(cls);
            List<Class> list2 = list;
            ArrayList arrayList = new ArrayList(qe.d(list2, 10));
            for (Class cls2 : list2) {
                cls2.getClass();
                arrayList.add(kotlin.jvm.internal.a(cls2));
            }
            linkedHashMap.put(a10, arrayList);
        }
        return linkedHashMap;
    }

    public Map p() {
        return qe.t.f24024u;
    }

    public final boolean q() {
        p pVar = this.e;
        if (pVar != null) {
            if (pVar.f17511g != null) {
                return true;
            }
            return false;
        }
        kotlin.jvm.internal.l.h("connectionManager");
        throw null;
    }

    public final boolean r() {
        if (t() && k().y().J()) {
            return true;
        }
        return false;
    }

    public final void s(p5.a aVar) {
        aVar.getClass();
        f j10 = j();
        o0 o0Var = j10.f17438b;
        o0Var.getClass();
        p5.c T = aVar.T("PRAGMA query_only");
        try {
            T.P();
            boolean u9 = T.u();
            ug.a.b(T, null);
            if (!u9) {
                n9.a(aVar, "PRAGMA temp_store = MEMORY");
                n9.a(aVar, "PRAGMA recursive_triggers = 1");
                n9.a(aVar, "DROP TABLE IF EXISTS room_table_modification_log");
                if (o0Var.f17500d) {
                    n9.a(aVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    n9.a(aVar, mf.i("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                j jVar = o0Var.f17503h;
                ReentrantLock reentrantLock = jVar.f17461a;
                reentrantLock.lock();
                try {
                    jVar.f17464d = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (j10.f17442g) {
            }
        } finally {
        }
    }

    public final boolean t() {
        p pVar = this.e;
        if (pVar != null) {
            r5.c cVar = pVar.f17512h;
            if (cVar != null) {
                return cVar.isOpen();
            }
            return false;
        }
        kotlin.jvm.internal.l.h("connectionManager");
        throw null;
    }

    public final Object u(Callable callable) {
        a1.c cVar = new a1.c(18, callable);
        if (q()) {
            c();
            try {
                Object call = callable.call();
                v();
                return call;
            } finally {
                h();
            }
        }
        a1.f fVar = new a1.f(13, cVar);
        a();
        b();
        Object obj = (te.g) this.i.get();
        if (obj == null) {
            obj = te.h.f25707u;
        }
        return e8.a(new a6.f(obj, this, fVar, (te.c) null, 20));
    }

    public final void v() {
        k().y().w();
    }

    public final Object w(boolean z3, df.p pVar, ve.c cVar) {
        p pVar2 = this.e;
        if (pVar2 != null) {
            return pVar2.f17510f.F(z3, pVar, cVar);
        }
        kotlin.jvm.internal.l.h("connectionManager");
        throw null;
    }
}
