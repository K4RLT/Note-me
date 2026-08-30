package k6;
import c.a;

import androidx.work.impl.WorkDatabase;
import j.m0;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19564a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19565b;

    public /* synthetic */ g(int i, Object obj) {
        this.f19564a = i;
        this.f19565b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        Map map;
        rd.c cVar;
        FileInputStream fileInputStream;
        Throwable th;
        switch (this.f19564a) {
            case 0:
                WorkDatabase workDatabase = (WorkDatabase) ((i) this.f19565b).f19569v;
                Long g8 = workDatabase.y().g("next_alarm_manager_id");
                int i10 = 0;
                if (g8 != null) {
                    i = (int) g8.longValue();
                } else {
                    i = 0;
                }
                if (i != Integer.MAX_VALUE) {
                    i10 = i + 1;
                }
                workDatabase.y().h(new j6.d("next_alarm_manager_id", Long.valueOf(i10)));
                return Integer.valueOf(i);
            case 1:
                com.google.android.gms.internal.ads.d dVar = (com.google.android.gms.internal.ads.d) this.f19565b;
                ((AtomicReference) dVar.f5231w).set(null);
                synchronized (dVar) {
                    if (((AtomicMarkableReference) dVar.f5230v).isMarked()) {
                        pc.d dVar2 = (pc.d) ((AtomicMarkableReference) dVar.f5230v).getReference();
                        synchronized (dVar2) {
                            map = Collections.unmodifiableMap(new HashMap(dVar2.f22652a));
                        }
                        AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) dVar.f5230v;
                        atomicMarkableReference.set((pc.d) atomicMarkableReference.getReference(), false);
                    } else {
                        map = null;
                    }
                }
                if (map != null) {
                    m0 m0Var = (m0) dVar.f5232x;
                    ((pc.g) m0Var.f18662u).g((String) m0Var.f18664w, map, dVar.f5229u);
                }
                return null;
            case 2:
                return ((qd.h) this.f19565b).a();
            case 3:
                rd.l lVar = (rd.l) this.f19565b;
                synchronized (lVar) {
                    cVar = null;
                    try {
                        fileInputStream = lVar.f24740a.openFileInput(lVar.f24741b);
                    } catch (FileNotFoundException | JSONException unused) {
                        fileInputStream = null;
                    } catch (Throwable th2) {
                        fileInputStream = null;
                        th = th2;
                    }
                    try {
                        int available = fileInputStream.available();
                        byte[] bArr = new byte[available];
                        fileInputStream.read(bArr, 0, available);
                        cVar = rd.a(new JSONObject(new String(bArr, "UTF-8")));
                        fileInputStream.close();
                    } catch (FileNotFoundException | JSONException unused2) {
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return cVar;
                    } catch (Throwable th3) {
                        th = th3;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        throw th;
                    }
                }
                return cVar;
            default:
                return new z5.e((JsReplyProxyBoundaryInterface) this.f19565b);
        }
    }
}
