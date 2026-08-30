package com.google.android.gms.internal.ads;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* loaded from: classes.dex */
public final class w91 {

    /* renamed from: c, reason: collision with root package name */
    public static final w91 f12178c;

    /* renamed from: d, reason: collision with root package name */
    public static final w91 f12179d;
    public static final w91 e;

    /* renamed from: f, reason: collision with root package name */
    public static final w91 f12180f;

    /* renamed from: g, reason: collision with root package name */
    public static final w91 f12181g;

    /* renamed from: h, reason: collision with root package name */
    public static final w91 f12182h;
    public static final w91 i;

    /* renamed from: j, reason: collision with root package name */
    public static final w91 f12183j;

    /* renamed from: k, reason: collision with root package name */
    public static final w91 f12184k;

    /* renamed from: l, reason: collision with root package name */
    public static final w91 f12185l;

    /* renamed from: m, reason: collision with root package name */
    public static final w91 f12186m;

    /* renamed from: n, reason: collision with root package name */
    public static final w91 f12187n;

    /* renamed from: o, reason: collision with root package name */
    public static final w91 f12188o;

    /* renamed from: p, reason: collision with root package name */
    public static final w91 f12189p;

    /* renamed from: q, reason: collision with root package name */
    public static final w91 f12190q;

    /* renamed from: r, reason: collision with root package name */
    public static final w91 f12191r;

    /* renamed from: s, reason: collision with root package name */
    public static final w91 f12192s;

    /* renamed from: t, reason: collision with root package name */
    public static final w91 f12193t;

    /* renamed from: u, reason: collision with root package name */
    public static final w91 f12194u;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12195a;

    /* renamed from: b, reason: collision with root package name */
    public String f12196b;

    static {
        int i10 = 0;
        f12178c = new w91("UNKNOWN_KEYMATERIAL", i10);
        f12179d = new w91("SYMMETRIC", i10);
        e = new w91("ASYMMETRIC_PRIVATE", i10);
        f12180f = new w91("ASYMMETRIC_PUBLIC", i10);
        f12181g = new w91("REMOTE", i10);
        int i11 = 1;
        f12182h = new w91("TINK", i11);
        i = new w91("CRUNCHY", i11);
        f12183j = new w91("NO_PREFIX", i11);
        int i12 = 2;
        f12184k = new w91("TINK", i12);
        f12185l = new w91("NO_PREFIX", i12);
        int i13 = 3;
        f12186m = new w91("TINK", i13);
        f12187n = new w91("CRUNCHY", i13);
        f12188o = new w91("NO_PREFIX", i13);
        int i14 = 4;
        f12189p = new w91("IEEE_P1363", i14);
        f12190q = new w91("DER", i14);
        int i15 = 5;
        f12191r = new w91("TINK", i15);
        f12192s = new w91("CRUNCHY", i15);
        f12193t = new w91("LEGACY", i15);
        f12194u = new w91("NO_PREFIX", i15);
    }

    public w91(String str) {
        this.f12195a = 8;
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb2 = new StringBuilder(String.valueOf(myUid).length() + 15 + String.valueOf(myPid).length() + 2);
        g3.a.r(myUid, myPid, "UID: [", "]  PID: [", sb2);
        sb2.append("] ");
        this.f12196b = sb2.toString().concat(str);
    }

    public static w91 a(xk0 xk0Var) {
        String str;
        String str2;
        xk0Var.G(2);
        int K = xk0Var.K();
        int i10 = K >> 1;
        int i11 = K & 1;
        int K2 = xk0Var.K() >> 3;
        if (i10 != 4 && i10 != 5 && i10 != 7 && i10 != 8) {
            if (i10 == 9) {
                str = "dvav";
            } else if (i10 == 10) {
                str = "dav1";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        int i12 = K2 | (i11 << 5);
        String str3 = ".";
        if (i10 >= 10) {
            str2 = ".";
        } else {
            str2 = ".0";
        }
        int length = str2.length() + 4;
        int length2 = String.valueOf(i10).length();
        int length3 = String.valueOf(i12).length();
        if (i12 < 10) {
            str3 = ".0";
        }
        StringBuilder sb2 = new StringBuilder(g3.a.v(str3, length + length2, length3));
        sb2.append(str);
        sb2.append(str2);
        sb2.append(i10);
        sb2.append(str3);
        sb2.append(i12);
        return new w91(sb2.toString(), 7);
    }

    public static String f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e8) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e8);
                String join = TextUtils.join(", ", objArr);
                int length = str2.length();
                str2 = a5.a.l(new StringBuilder(String.valueOf(join).length() + length + 2 + 1), str2, " [", join, "]");
            }
        }
        return p.a.o(new StringBuilder(str.length() + 3 + str2.length()), str, " : ", str2);
    }

    public void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", f(this.f12196b, str, objArr));
        }
    }

    public void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", f(this.f12196b, str, objArr));
        }
    }

    public void d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", f(this.f12196b, str, objArr));
        }
    }

    public void e(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", f(this.f12196b, str, objArr), remoteException);
        }
    }

    public String toString() {
        switch (this.f12195a) {
            case 0:
                return this.f12196b;
            case 1:
                return this.f12196b;
            case 2:
                return this.f12196b;
            case 3:
                return this.f12196b;
            case 4:
                return this.f12196b;
            case 5:
                return this.f12196b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ w91(String str, int i10) {
        this.f12195a = i10;
        this.f12196b = str;
    }
}
