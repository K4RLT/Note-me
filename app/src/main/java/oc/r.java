package oc;
import q.h;
import q.x;
import r.b;

import android.content.Context;
import com.google.android.gms.internal.measurement.e4;
import com.google.android.gms.internal.mlkit_vision_digital_ink.lw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import qc.s0;
import qc.t0;
import qc.u0;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f21931f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f21932g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f21933a;

    /* renamed from: b, reason: collision with root package name */
    public final w f21934b;

    /* renamed from: c, reason: collision with root package name */
    public final b6.u f21935c;

    /* renamed from: d, reason: collision with root package name */
    public final e4 f21936d;
    public final lw e;

    static {
        HashMap hashMap = new HashMap();
        f21931f = hashMap;
        a5.a.o(5, hashMap, "armeabi", 6, "armeabi-v7a");
        a5.a.o(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        f21932g = "Crashlytics Android SDK/19.0.3";
    }

    public r(Context context, w wVar, b6.u uVar, e4 e4Var, lw lwVar) {
        this.f21933a = context;
        this.f21934b = wVar;
        this.f21935c = uVar;
        this.f21936d = e4Var;
        this.e = lwVar;
    }

    public static t0 c(nd.o oVar, int i) {
        String str = (String) oVar.f21272v;
        String str2 = (String) oVar.f21271u;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) oVar.f21273w;
        int i10 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        nd.o oVar2 = (nd.o) oVar.f21274x;
        if (i >= 8) {
            nd.o oVar3 = oVar2;
            while (oVar3 != null) {
                oVar3 = (nd.o) oVar3.f21274x;
                i10++;
            }
        }
        int i11 = i10;
        List d2 = d(stackTraceElementArr, 4);
        if (d2 != null) {
            byte b10 = (byte) (0 | 1);
            t0 t0Var = null;
            if (oVar2 != null && i11 == 0) {
                t0Var = c(oVar2, i + 1);
            }
            if (b10 == 1) {
                return new t0(str, str2, d2, t0Var, i11);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((b10 & 1) == 0) {
                sb2.append(" overflowCount");
            }
            x.o(g3.a.l("Missing required properties:", sb2));
            return null;
        }
        g5.h("Null frames");
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [qc.w0, java.lang.Object] */
    public static List d(StackTraceElement[] stackTraceElementArr, int i) {
        long j10;
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            Object obj = new Object();
            obj.e = i;
            obj.f23960f = (byte) (obj.f23960f | 4);
            long j11 = 0;
            if (stackTraceElement.isNativeMethod()) {
                j10 = Math.max(stackTraceElement.getLineNumber(), 0L);
            } else {
                j10 = 0;
            }
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j11 = stackTraceElement.getLineNumber();
            }
            obj.f23956a = j10;
            byte b10 = (byte) (obj.f23960f | 1);
            obj.f23957b = str;
            obj.f23958c = fileName;
            obj.f23959d = j11;
            obj.f23960f = (byte) (b10 | 2);
            arrayList.add(obj.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static u0 e() {
        byte b10 = (byte) 1;
        if (b10 == 1) {
            return new u0(0L, "0", "0");
        }
        StringBuilder sb2 = new StringBuilder();
        if (b10 == 0) {
            sb2.append(" address");
        }
        x.o(g3.a.l("Missing required properties:", sb2));
        return null;
    }

    public final List a() {
        byte b10 = (byte) (((byte) (0 | 1)) | 2);
        b6.u uVar = this.f21935c;
        String str = (String) uVar.f1784x;
        if (str != null) {
            String str2 = (String) uVar.f1782v;
            if (b10 == 3) {
                return Collections.singletonList(new s0(0L, 0L, str, str2));
            }
            StringBuilder sb2 = new StringBuilder();
            if ((b10 & 1) == 0) {
                sb2.append(" baseAddress");
            }
            if ((b10 & 2) == 0) {
                sb2.append(" size");
            }
            x.o(g3.a.l("Missing required properties:", sb2));
            return null;
        }
        g5.h("Null name");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, qc.a1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final qc.b1 b(int r17) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oc.b(int):qc.b1");
    }
}