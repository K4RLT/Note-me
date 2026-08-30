package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class o5 implements yb.d, r5 {

    /* renamed from: v, reason: collision with root package name */
    public static final c5 f13872v = new c5(7);

    /* renamed from: u, reason: collision with root package name */
    public Object f13873u;

    @Override // com.google.android.gms.internal.measurement.r5
    public boolean a(Class cls) {
        for (r5 r5Var : (r5[]) this.f13873u) {
            if (r5Var.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.r5
    public z5 b(Class cls) {
        for (r5 r5Var : (r5[]) this.f13873u) {
            if (r5Var.a(cls)) {
                return r5Var.b(cls);
            }
        }
        androidx.datastore.preferences.protobuf.s1.k("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [n.r0] */
    public Object c() {
        HashMap hashMap;
        b4 b4Var = (b4) this.f13873u;
        Cursor query = b4Var.f13648u.query(b4Var.f13649v, b4.C, null, null, null);
        if (query == null) {
            return Collections.EMPTY_MAP;
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.EMPTY_MAP;
            }
            if (count <= 256) {
                hashMap = new n.r0(count);
            } else {
                hashMap = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                hashMap.put(query.getString(0), query.getString(1));
            }
            return hashMap;
        } finally {
            query.close();
        }
    }

    public void d(int i, Object obj, a6 a6Var) {
        t4 t4Var = (t4) this.f13873u;
        t4Var.o(i, 3);
        a6Var.e((m4) obj, t4Var.f13916a);
        t4Var.o(i, 4);
    }

    public void e(int i, Object obj, a6 a6Var) {
        t4 t4Var = (t4) this.f13873u;
        m4 m4Var = (m4) obj;
        t4Var.o(i, 2);
        t4Var.n(m4Var.a(a6Var));
        a6Var.e(m4Var, t4Var.f13916a);
    }

    @Override // yb.d
    public Object get() {
        yb.b bVar;
        yb.b c10;
        Context context = (Context) this.f13873u;
        yb.b bVar2 = g4.f13759a;
        if (bVar2 == null) {
            synchronized (g4.class) {
                try {
                    bVar = g4.f13759a;
                    if (bVar == null) {
                        String str = Build.TYPE;
                        String str2 = Build.TAGS;
                        n.e eVar = h4.f13769a;
                        if ((!str.equals("eng") && !str.equals("userdebug")) || (!str2.contains("dev-keys") && !str2.contains("test-keys"))) {
                            c10 = yb.a.f31630u;
                            bVar = c10;
                            g4.f13759a = bVar;
                        }
                        if (!context.isDeviceProtectedStorage()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        c10 = w3.c(context);
                        bVar = c10;
                        g4.f13759a = bVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bVar;
        }
        return bVar2;
    }
}
