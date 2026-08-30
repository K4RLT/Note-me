package a5;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import androidx.datastore.preferences.protobuf.k;
import b8.i4;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.ads.x21;
import com.google.android.gms.internal.ads.zd0;
import g5.q;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import p5.c;
import q.x;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static final boolean a(int i) {
        if (i != 3 && i != 4 && i != 6) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ int b(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return AdError.NETWORK_ERROR_CODE;
        }
        throw null;
    }

    public static int c(int i, int i10, int i11) {
        return k.m(i) + i10 + i11;
    }

    public static int d(int i, int i10, int i11, int i12) {
        return k.n(i) + i10 + i11 + i12;
    }

    public static Float e(i4 i4Var, float f10) {
        return Float.valueOf(i4Var.k() * f10);
    }

    public static String f(int i, String str, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(i);
        return sb2.toString();
    }

    public static String g(String str, String str2) {
        return str + str2;
    }

    public static String h(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String i(StringBuilder sb2, int i, char c10) {
        sb2.append(i);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String j(StringBuilder sb2, String str, int i, String str2) {
        sb2.append(str);
        sb2.append(i);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String k(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String l(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2.toString();
    }

    public static StringBuilder m(String str, String str2, String str3, int i, String str4) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(i);
        sb2.append(str4);
        return sb2;
    }

    public static void n(int i, int i10, String str, String str2, StringBuilder sb2) {
        sb2.append(i);
        sb2.append(str);
        sb2.append(i10);
        sb2.append(str2);
    }

    public static void o(int i, HashMap hashMap, String str, int i10, String str2) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i10));
    }

    public static /* synthetic */ void p(Object obj) {
        if (obj == null) {
            return;
        }
        q.b();
    }

    public static void q(String str, int i, int i10, String str2) {
        StringBuilder sb2 = new StringBuilder(i);
        sb2.append(str);
        sb2.append(i10);
        x21.F(str2, sb2.toString());
    }

    public static void r(String str, String str2, String str3) {
        x21.F(str3, str2.concat(String.valueOf(str)));
    }

    public static void s(StringBuilder sb2, float f10, String str, float f11, String str2) {
        sb2.append(f10);
        sb2.append(str);
        sb2.append(f11);
        sb2.append(str2);
    }

    public static void t(StringBuilder sb2, String str, int i, String str2) {
        sb2.append(str);
        sb2.append(i);
        x21.F(str2, sb2.toString());
    }

    public static void u(la.a aVar, zd0 zd0Var, String str) {
        aVar.getClass();
        zd0Var.c(System.currentTimeMillis(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void v(c cVar) {
        boolean isTerminated;
        if (cVar instanceof AutoCloseable) {
            cVar.close();
            return;
        }
        if (!(cVar instanceof ExecutorService)) {
            if (cVar instanceof TypedArray) {
                ((TypedArray) cVar).recycle();
                return;
            }
            if (cVar instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) cVar).release();
                return;
            } else if (cVar instanceof MediaDrm) {
                ((MediaDrm) cVar).release();
                return;
            } else {
                x.m();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) cVar;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z3 = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z3) {
                    executorService.shutdownNow();
                    z3 = true;
                }
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
    }

    public static int w(int i, int i10, int i11, int i12) {
        return ((i + i10) - i11) + i12;
    }

    public static /* synthetic */ String x(int i) {
        switch (i) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String y(int i) {
        switch (i) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return "null";
        }
    }
}
