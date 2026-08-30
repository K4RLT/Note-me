package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c5 implements r5, v5 {

    /* renamed from: v, reason: collision with root package name */
    public static final c5 f13672v = new c5(0);

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13673u;

    public /* synthetic */ c5(int i) {
        this.f13673u = i;
    }

    public static HashMap c(ContentResolver contentResolver, String[] strArr, c5 c5Var) {
        Cursor query = contentResolver.query(x3.f13965b, null, null, strArr, null);
        try {
            if (query != null) {
                HashMap hashMap = new HashMap(query.getCount(), 1.0f);
                while (query.moveToNext()) {
                    hashMap.put(query.getString(0), query.getString(1));
                }
                query.close();
                return hashMap;
            }
            throw new Exception("Failed to connect to GservicesProvider");
        } catch (Throwable th) {
            if (query != null) {
                try {
                    query.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.measurement.r5
    public boolean a(Class cls) {
        switch (this.f13673u) {
            case 0:
                return b5.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.measurement.r5
    public z5 b(Class cls) {
        switch (this.f13673u) {
            case 0:
                if (b5.class.isAssignableFrom(cls)) {
                    try {
                        return (z5) b5.d(cls.asSubclass(b5.class)).g(3);
                    } catch (Exception e) {
                        l4.a.k("Unable to get message info for ".concat(cls.getName()), e);
                    }
                } else {
                    q.x.n("Unsupported message type: ".concat(cls.getName()));
                }
                return null;
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
