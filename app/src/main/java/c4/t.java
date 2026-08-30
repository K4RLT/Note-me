package c4;
import t.e;

import com.google.android.gms.internal.mlkit_vision_digital_ink.c2;
import com.google.android.gms.internal.mlkit_vision_digital_ink.e7;
import com.google.android.gms.internal.mlkit_vision_digital_ink.n5;
import com.google.android.gms.internal.mlkit_vision_digital_ink.q6;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3858a;

    /* renamed from: b, reason: collision with root package name */
    public int f3859b;

    /* renamed from: c, reason: collision with root package name */
    public int f3860c;

    /* renamed from: d, reason: collision with root package name */
    public int f3861d;
    public final Object e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3862f;

    /* renamed from: g, reason: collision with root package name */
    public Object f3863g;

    public t(e7 e7Var, Object[] objArr, StringBuilder sb2) {
        this.f3858a = 2;
        this.f3859b = 0;
        this.f3860c = -1;
        n5.e(e7Var, "context");
        this.e = e7Var;
        this.f3861d = 0;
        this.f3862f = objArr;
        this.f3863g = sb2;
    }

    public static void h(StringBuilder sb2, Object obj, String str) {
        sb2.append("[INVALID: format=");
        sb2.append(str);
        sb2.append(", type=");
        sb2.append(obj.getClass().getCanonicalName());
        sb2.append(", value=");
        sb2.append(q6.a(obj));
        sb2.append("]");
    }

    public void a() {
        this.f3859b = 1;
        this.f3862f = (w) this.e;
        this.f3861d = 0;
    }

    public boolean b() {
        d4.a b10 = ((w) this.f3862f).f3872b.b();
        int a10 = b10.a(6);
        if ((a10 != 0 && ((ByteBuffer) b10.f15727x).get(a10 + b10.f15724u) != 0) || this.f3860c == 65039) {
            return true;
        }
        return false;
    }

    public void c() {
        c2 c2Var = ((c2) this.f3863g).f14145c;
        if (c2Var != null) {
            this.f3863g = c2Var;
        } else {
            this.f3863g = (c2) this.f3862f;
            int i = this.f3860c;
            if (i > 0) {
                this.f3860c = i - 1;
            }
            if (this.f3861d > 0) {
                this.f3859b++;
            }
        }
        d();
    }

    public void d() {
        if (this.f3860c != 0) {
            HashMap hashMap = ((c2) this.f3863g).f14146d;
            int[] iArr = (int[]) this.e;
            c2 c2Var = (c2) hashMap.get(Integer.valueOf(iArr[this.f3859b]));
            while (true) {
                int i = (c2Var.f14144b - c2Var.f14143a) + 1;
                int i10 = this.f3860c;
                if (i <= i10) {
                    int i11 = this.f3859b + i;
                    this.f3859b = i11;
                    this.f3863g = c2Var;
                    int i12 = i10 - i;
                    this.f3860c = i12;
                    if (i12 > 0) {
                        c2Var = (c2) c2Var.f14146d.get(Integer.valueOf(iArr[i11]));
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if ((r9 instanceof java.math.BigDecimal) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003f, code lost:
    
        if ((r9 instanceof java.math.BigInteger) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(java.lang.Object r9, com.google.android.gms.internal.mlkit_vision_digital_ink.n6 r10, com.google.android.gms.internal.mlkit_vision_digital_ink.o6 r11) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.e(java.lang.Object, com.google.android.gms.internal.mlkit_vision_digital_ink.n6, com.google.android.gms.internal.mlkit_vision_digital_ink.o6):void");
    }

    public void f(c2 c2Var, StringBuilder sb2) {
        for (c2 c2Var2 : c2Var.f14146d.values()) {
            sb2.append("  ");
            sb2.append(c2Var);
            sb2.append(" -> ");
            sb2.append(c2Var2);
            sb2.append(" [label=\"");
            int[] iArr = (int[]) this.e;
            sb2.append(Arrays.toString(Arrays.copyOfRange(iArr, c2Var2.f14143a, Math.min(iArr.length, c2Var2.f14144b + 1))));
            sb2.append("\"]\n");
            f(c2Var2, sb2);
        }
    }

    public boolean g(int i, int i10, int i11, int i12) {
        if (i >= 0 && i11 >= 0) {
            int[] iArr = (int[]) this.e;
            int length = iArr.length;
            int min = Math.min(length, i10);
            if (min - i == Math.min(length, i12) - i11) {
                for (int i13 = i; i13 <= min; i13++) {
                    if (iArr[i13] != iArr[(i11 + i13) - i]) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public String toString() {
        switch (this.f3858a) {
            case 1:
                StringBuilder sb2 = new StringBuilder("digraph {\n");
                f((c2) this.f3862f, sb2);
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public t(int[] iArr) {
        this.f3858a = 1;
        this.e = iArr;
        c2 c2Var = new c2(-1, -1);
        this.f3862f = c2Var;
        this.f3863g = c2Var;
    }

    public t(w wVar) {
        this.f3858a = 0;
        this.f3859b = 1;
        this.e = wVar;
        this.f3862f = wVar;
    }
}
