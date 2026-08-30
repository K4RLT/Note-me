package com.google.android.gms.internal.ads;
import c4.k;
import d6.i;
import g3.a;
import g9.c2;
import i0.d;
import j.f;
import l.a;
import n2.b;
import q3.p;
import s2.a;
import va.a;
import ya.l1;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import android.widget.TextView;
import java.lang.Character;
import java.lang.ref.WeakReference;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class l3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7924a;

    /* renamed from: b, reason: collision with root package name */
    public int f7925b;

    /* renamed from: c, reason: collision with root package name */
    public int f7926c;

    /* renamed from: d, reason: collision with root package name */
    public Object f7927d;
    public Object e;

    public l3(CharSequence charSequence, int i, Locale locale) {
        this.f7924a = 7;
        this.f7927d = charSequence;
        if (charSequence.length() < 0) {
            a.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            a.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.e = wordInstance;
        this.f7925b = Math.max(0, -50);
        this.f7926c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new b(charSequence, i));
    }

    public static l3 o(xk0 xk0Var) {
        int i;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        try {
            if (xk0Var.b() == 0) {
                int K = xk0Var.K();
                int i16 = K >> 1;
                int i17 = 1;
                String str = "L";
                if ((K & 1) != 0) {
                    xk0Var.G(1);
                    int K2 = xk0Var.K() >> 4;
                    i = xk0Var.K() >> 5;
                    int K3 = xk0Var.K() & 63;
                    int K4 = xk0Var.K();
                    i11 = K4 >> 1;
                    if ((K4 & 1) != 0) {
                        str = "H";
                    }
                    i10 = xk0Var.K();
                    xk0Var.G(K3);
                    int i18 = K2 & 7;
                    if (i18 > 1) {
                        int K5 = xk0Var.K();
                        for (int i19 = 0; i19 < i18 - 1; i19++) {
                            if (((K5 >> (7 - i19)) & 1) != 0) {
                                xk0Var.G(1);
                            }
                        }
                    }
                    xk0Var.G(xk0Var.K() * 4);
                    xk0Var.G(6);
                } else {
                    i = 0;
                    i10 = 0;
                    i11 = 0;
                }
                int K6 = xk0Var.K();
                int i20 = xk0Var.f12581b;
                int i21 = 0;
                int i22 = 0;
                while (true) {
                    i12 = 12;
                    i13 = 13;
                    if (i21 >= K6) {
                        break;
                    }
                    int K7 = xk0Var.K() & 31;
                    if (K7 != 13 && K7 != 12) {
                        i15 = xk0Var.L();
                    } else {
                        i15 = 1;
                    }
                    for (int i23 = 0; i23 < i15; i23++) {
                        int L = xk0Var.L();
                        i22 = L + 4 + i22;
                        xk0Var.G(L);
                    }
                    i21++;
                }
                xk0Var.E(i20);
                byte[] bArr = new byte[i22];
                int i24 = 0;
                int i25 = 0;
                while (i24 < K6) {
                    int K8 = xk0Var.K() & 31;
                    if (K8 != i13 && K8 != i12) {
                        i14 = xk0Var.L();
                    } else {
                        i14 = i17;
                    }
                    int i26 = i17;
                    for (int i27 = 0; i27 < i14; i27++) {
                        int L2 = xk0Var.L();
                        System.arraycopy(xy.I, 0, bArr, i25, 4);
                        int i28 = i25 + 4;
                        xk0Var.H(bArr, i28, L2);
                        i25 = i28 + L2;
                    }
                    i24++;
                    i17 = i26;
                    i12 = 12;
                    i13 = 13;
                }
                Locale locale = Locale.US;
                return new l3(d51.q(bArr), (i16 & 3) + 1, "vvc1." + i11 + "." + str + i10, i + 8);
            }
            throw a(null, "Unsupported VVC version");
        } catch (ArrayIndexOutOfBoundsException e) {
            throw a(e, "Error parsing VVC configuration");
        }
    }

    public static l3 r(int i) {
        return new l3(4, i, (String) null, (Exception) null);
    }

    public void a(int i) {
        new Handler(Looper.getMainLooper()).post(new d(this, i, 1));
    }

    public void b(int i) {
        int i10 = this.f7925b;
        int i11 = this.f7926c;
        boolean z3 = false;
        if (i <= i11 && i10 <= i) {
            z3 = true;
        }
        if (!z3) {
            StringBuilder n10 = a.n("Invalid offset: ", i, ". Valid range is [", " , ", i10);
            n10.append(i11);
            n10.append(']');
            a.a(n10.toString());
        }
    }

    public int c() {
        androidx.datastore.preferences.protobuf.i iVar = (androidx.datastore.preferences.protobuf.i) this.f7927d;
        String str = (String) this.e;
        if (iVar == null) {
            return str.length();
        }
        return (iVar.f734v - iVar.a()) + (str.length() - (this.f7926c - this.f7925b));
    }

    public boolean d(int i) {
        CharSequence charSequence = (CharSequence) this.f7927d;
        int i10 = this.f7925b + 1;
        if (i <= this.f7926c && i10 <= i) {
            if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
                int i11 = i - 1;
                if (!Character.isSurrogate(charSequence.charAt(i11))) {
                    if (k.d()) {
                        k a10 = k.a();
                        if (a10.c() != 1 || a10.b(charSequence, i11) == -1) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean e(int i) {
        int i10 = this.f7925b + 1;
        if (i <= this.f7926c && i10 <= i) {
            return l1.a(Character.codePointBefore((CharSequence) this.f7927d, i));
        }
        return false;
    }

    public boolean f(int i) {
        b(i);
        if (((BreakIterator) this.e).isBoundary(i)) {
            if (!h(i) || !h(i - 1) || !h(i + 1)) {
                if (i <= 0 || i >= ((CharSequence) this.f7927d).length() - 1 || (!g(i) && !g(i + 1))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public boolean g(int i) {
        CharSequence charSequence = (CharSequence) this.f7927d;
        int i10 = i - 1;
        Character.UnicodeBlock of2 = Character.UnicodeBlock.of(charSequence.charAt(i10));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (!kotlin.jvm.internal.a(of2, unicodeBlock) || !kotlin.jvm.internal.a(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            if (kotlin.jvm.internal.a(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && kotlin.jvm.internal.a(Character.UnicodeBlock.of(charSequence.charAt(i10)), Character.UnicodeBlock.KATAKANA)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean h(int i) {
        CharSequence charSequence = (CharSequence) this.f7927d;
        int i10 = this.f7925b;
        if (i < this.f7926c && i10 <= i) {
            if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
                if (k.d()) {
                    k a10 = k.a();
                    if (a10.c() != 1 || a10.b(charSequence, i) == -1) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean i(int i) {
        int i10 = this.f7925b;
        if (i < this.f7926c && i10 <= i) {
            return l1.a(Character.codePointAt((CharSequence) this.f7927d, i));
        }
        return false;
    }

    public int j(int i) {
        b(i);
        int following = ((BreakIterator) this.e).following(i);
        if (h(following - 1) && h(following) && !g(following)) {
            return j(following);
        }
        return following;
    }

    public void l(Typeface typeface) {
        int i;
        boolean z3;
        int i10 = 2;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f7925b) != -1) {
            if ((this.f7926c & 2) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            typeface = f.a(typeface, i, z3);
        }
        c2 c2Var = (c2) this.e;
        WeakReference weakReference = (WeakReference) this.f7927d;
        if (c2Var.f17580c) {
            c2Var.f17588m = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                boolean z9 = p.f23420a;
                boolean isAttachedToWindow = textView.isAttachedToWindow();
                int i11 = c2Var.f17578a;
                if (isAttachedToWindow) {
                    textView.post(new i(i11, i10, textView, typeface));
                } else {
                    textView.setTypeface(typeface, i11);
                }
            }
        }
    }

    public int m(int i) {
        b(i);
        int preceding = ((BreakIterator) this.e).preceding(i);
        if (h(preceding) && d(preceding) && !g(preceding)) {
            return m(preceding);
        }
        return preceding;
    }

    public void n(String str, int i, int i10) {
        if (i > i10) {
            a.a("start index must be less than or equal to end index: " + i + " > " + i10);
        }
        if (i < 0) {
            a.a("start must be non-negative, but was " + i);
        }
        androidx.datastore.preferences.protobuf.i iVar = (androidx.datastore.preferences.protobuf.i) this.f7927d;
        if (iVar == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i, 64);
            int min2 = Math.min(((String) this.e).length() - i10, 64);
            String str2 = (String) this.e;
            int i11 = i - min;
            str2.getClass();
            str2.getChars(i11, i, cArr, 0);
            String str3 = (String) this.e;
            int i12 = max - min2;
            int i13 = min2 + i10;
            str3.getClass();
            str3.getChars(i10, i13, cArr, i12);
            str.getChars(0, str.length(), cArr, min);
            int length = str.length() + min;
            androidx.datastore.preferences.protobuf.i iVar2 = new androidx.datastore.preferences.protobuf.i(6);
            iVar2.f734v = max;
            iVar2.f737y = cArr;
            iVar2.f735w = length;
            iVar2.f736x = i12;
            this.f7927d = iVar2;
            this.f7925b = i11;
            this.f7926c = i13;
            return;
        }
        int i14 = this.f7925b;
        int i15 = i - i14;
        int i16 = i10 - i14;
        if (i15 >= 0 && i16 <= iVar.f734v - iVar.a()) {
            int length2 = str.length() - (i16 - i15);
            if (length2 > iVar.a()) {
                int a10 = length2 - iVar.a();
                int i17 = iVar.f734v;
                do {
                    i17 *= 2;
                } while (i17 - iVar.f734v < a10);
                char[] cArr2 = new char[i17];
                System.arraycopy((char[]) iVar.f737y, 0, cArr2, 0, iVar.f735w);
                int i18 = iVar.f734v;
                int i19 = iVar.f736x;
                int i20 = i18 - i19;
                int i21 = i17 - i20;
                System.arraycopy((char[]) iVar.f737y, i19, cArr2, i21, (i20 + i19) - i19);
                iVar.f737y = cArr2;
                iVar.f734v = i17;
                iVar.f736x = i21;
            }
            int i22 = iVar.f735w;
            if (i15 < i22 && i16 <= i22) {
                int i23 = i22 - i16;
                char[] cArr3 = (char[]) iVar.f737y;
                System.arraycopy(cArr3, i16, cArr3, iVar.f736x - i23, i23);
                iVar.f735w = i15;
                iVar.f736x -= i23;
            } else if (i15 < i22 && i16 >= i22) {
                iVar.f736x = iVar.a() + i16;
                iVar.f735w = i15;
            } else {
                int a11 = iVar.a() + i15;
                int a12 = iVar.a() + i16;
                int i24 = iVar.f736x;
                int i25 = a11 - i24;
                char[] cArr4 = (char[]) iVar.f737y;
                System.arraycopy(cArr4, i24, cArr4, iVar.f735w, i25);
                iVar.f735w += i25;
                iVar.f736x = a12;
            }
            str.getChars(0, str.length(), (char[]) iVar.f737y, iVar.f735w);
            iVar.f735w = str.length() + iVar.f735w;
            return;
        }
        this.e = toString();
        this.f7927d = null;
        this.f7925b = -1;
        this.f7926c = -1;
        n(str, i, i10);
    }

    public synchronized void p() {
        try {
            dw0 dw0Var = (dw0) this.e;
            if (dw0Var.f5542b) {
                fw0 fw0Var = dw0Var.f5541a;
                fw0Var.E2((byte[]) this.f7927d);
                fw0Var.B(this.f7925b);
                fw0Var.a0(this.f7926c);
                fw0Var.x0();
                fw0Var.a();
            }
        } catch (RemoteException e) {
            Log.d("GASS", "Clearcut log failed", e);
        }
    }

    public synchronized void q(long j10, Object obj) {
        try {
            if (this.f7926c > 0) {
                if (j10 <= ((long[]) this.f7927d)[((this.f7925b + r0) - 1) % ((Object[]) this.e).length]) {
                    synchronized (this) {
                        this.f7925b = 0;
                        this.f7926c = 0;
                        Arrays.fill((Object[]) this.e, (Object) null);
                    }
                }
            }
            int length = ((Object[]) this.e).length;
            if (this.f7926c >= length) {
                int i = length + length;
                long[] jArr = new long[i];
                Object[] objArr = new Object[i];
                int i10 = this.f7925b;
                int i11 = length - i10;
                System.arraycopy((long[]) this.f7927d, i10, jArr, 0, i11);
                System.arraycopy((Object[]) this.e, this.f7925b, objArr, 0, i11);
                int i12 = this.f7925b;
                if (i12 > 0) {
                    System.arraycopy((long[]) this.f7927d, 0, jArr, i11, i12);
                    System.arraycopy((Object[]) this.e, 0, objArr, i11, this.f7925b);
                }
                this.f7927d = jArr;
                this.e = objArr;
                this.f7925b = 0;
            }
            int i13 = this.f7925b;
            int i14 = this.f7926c;
            Object[] objArr2 = (Object[]) this.e;
            int length2 = (i13 + i14) % objArr2.length;
            ((long[]) this.f7927d)[length2] = j10;
            objArr2[length2] = obj;
            this.f7926c = i14 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int s() {
        return this.f7926c;
    }

    public synchronized Object t() {
        if (this.f7926c == 0) {
            return null;
        }
        return v();
    }

    public String toString() {
        switch (this.f7924a) {
            case 8:
                androidx.datastore.preferences.protobuf.i iVar = (androidx.datastore.preferences.protobuf.i) this.f7927d;
                String str = (String) this.e;
                if (iVar != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((CharSequence) str, 0, this.f7925b);
                    sb2.append((char[]) iVar.f737y, 0, iVar.f735w);
                    char[] cArr = (char[]) iVar.f737y;
                    int i = iVar.f736x;
                    sb2.append(cArr, i, iVar.f734v - i);
                    String str2 = (String) this.e;
                    sb2.append((CharSequence) str2, this.f7926c, str2.length());
                    return sb2.toString();
                }
                return str;
            default:
                return super.toString();
        }
    }

    public synchronized Object u(long j10) {
        Object obj;
        obj = null;
        while (this.f7926c > 0 && j10 - ((long[]) this.f7927d)[this.f7925b] >= 0) {
            obj = v();
        }
        return obj;
    }

    public Object v() {
        boolean z3;
        if (this.f7926c > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.K(z3);
        Object[] objArr = (Object[]) this.e;
        int i = this.f7925b;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f7925b = (i + 1) % objArr.length;
        this.f7926c--;
        return obj;
    }

    public void k(int i) {
    }

    public l3(int i, int i10, String str, Exception exc) {
        this.f7924a = 5;
        this.f7926c = i;
        this.f7925b = i10;
        this.e = str;
        this.f7927d = exc;
    }

    public l3(int i, ArrayList arrayList, int i10, sb sbVar) {
        this.f7924a = 2;
        this.f7925b = i;
        this.f7927d = arrayList;
        this.f7926c = i10;
        this.e = sbVar;
    }

    public l3(y51 y51Var, int i, String str, int i10) {
        this.f7924a = 0;
        this.f7927d = y51Var;
        this.f7925b = i;
        this.e = str;
        this.f7926c = i10;
    }

    public l3(int i) {
        this.f7924a = 1;
        this.f7927d = new x6[i];
        this.f7926c = 0;
    }

    public /* synthetic */ l3(dw0 dw0Var, byte[] bArr) {
        this.f7924a = 4;
        this.e = dw0Var;
        this.f7927d = bArr;
    }

    public l3(int i, byte b10) {
        this.f7924a = i;
        switch (i) {
            case 8:
                return;
            default:
                this.f7927d = new long[10];
                this.e = new Object[10];
                return;
        }
    }

    public l3(c2 c2Var, int i, int i10, WeakReference weakReference) {
        this.f7924a = 6;
        this.e = c2Var;
        this.f7925b = i;
        this.f7926c = i10;
        this.f7927d = weakReference;
    }
}
