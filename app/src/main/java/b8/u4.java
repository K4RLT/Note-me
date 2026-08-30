package b8;
import f.c;
import a7.g;
import j6.f;
import j9.m;
import pa.b;
import w6.c;
import y6.d0;
import z6.a;

import android.content.Context;
import android.graphics.Color;
import com.google.android.gms.internal.ads.gu1;
import com.google.android.gms.internal.ads.hu1;
import com.google.android.gms.internal.ads.ie0;
import com.google.android.gms.internal.ads.n80;
import com.google.android.gms.internal.ads.ze;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class u4 implements n80, ie0, b, q.p1, d0 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2824u;

    /* renamed from: v, reason: collision with root package name */
    public int f2825v;

    public /* synthetic */ u4(u4 u4Var) {
        this.f2824u = 5;
        this.f2825v = u4Var.f2825v;
    }

    @Override // b
    public int b(Context context, String str, boolean z3) {
        return 0;
    }

    @Override // b
    public int c(Context context, String str) {
        return this.f2825v;
    }

    @Override // d0
    public Object d(a aVar, float f10) {
        boolean z3;
        int i;
        float f11;
        int i10;
        int argb;
        float e;
        ArrayList arrayList = new ArrayList();
        int i11 = 1;
        int i12 = 0;
        if (aVar.H() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            aVar.f();
        }
        while (aVar.p()) {
            arrayList.add(Float.valueOf((float) aVar.w()));
        }
        int i13 = 2;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f2825v = 2;
        }
        if (z3) {
            aVar.k();
        }
        if (this.f2825v == -1) {
            this.f2825v = arrayList.size() / 4;
        }
        int i14 = this.f2825v;
        float[] fArr = new float[i14];
        int[] iArr = new int[i14];
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            i = this.f2825v * 4;
            if (i15 >= i) {
                break;
            }
            int i18 = i15 / 4;
            double floatValue = ((Float) arrayList.get(i15)).floatValue();
            int i19 = i12;
            int i20 = i15 % 4;
            if (i20 != 0) {
                if (i20 != i11) {
                    if (i20 != 2) {
                        if (i20 == 3) {
                            iArr[i18] = Color.argb(255, i16, i17, (int) (floatValue * 255.0d));
                        }
                    } else {
                        i17 = (int) (floatValue * 255.0d);
                    }
                } else {
                    i16 = (int) (floatValue * 255.0d);
                }
            } else {
                if (i18 > 0) {
                    float f12 = (float) floatValue;
                    if (fArr[i18 - 1] >= f12) {
                        fArr[i18] = f12 + 0.01f;
                    }
                }
                fArr[i18] = (float) floatValue;
            }
            i15++;
            i12 = i19;
            i11 = 1;
        }
        int i21 = i12;
        c cVar = new c(fArr, iArr);
        if (arrayList.size() <= i) {
            return cVar;
        }
        int size = (arrayList.size() - i) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        int i22 = i21;
        while (i < arrayList.size()) {
            if (i % 2 == 0) {
                fArr2[i22] = ((Float) arrayList.get(i)).floatValue();
            } else {
                fArr3[i22] = ((Float) arrayList.get(i)).floatValue();
                i22++;
            }
            i++;
        }
        float[] fArr4 = cVar.f27712a;
        if (fArr4.length == 0) {
            fArr4 = fArr2;
        } else if (size != 0) {
            int length = fArr4.length + size;
            float[] fArr5 = new float[length];
            int i23 = i21;
            int i24 = i23;
            int i25 = i24;
            int i26 = i25;
            while (i23 < length) {
                float f13 = Float.NaN;
                if (i25 < fArr4.length) {
                    f11 = fArr4[i25];
                } else {
                    f11 = Float.NaN;
                }
                if (i26 < size) {
                    f13 = fArr2[i26];
                }
                if (!Float.isNaN(f13) && f11 >= f13) {
                    if (!Float.isNaN(f11) && f13 >= f11) {
                        fArr5[i23] = f11;
                        i25++;
                        i26++;
                        i24++;
                    } else {
                        fArr5[i23] = f13;
                        i26++;
                    }
                } else {
                    fArr5[i23] = f11;
                    i25++;
                }
                i23++;
            }
            if (i24 == 0) {
                fArr4 = fArr5;
            } else {
                fArr4 = Arrays.copyOf(fArr5, length - i24);
            }
        }
        int length2 = fArr4.length;
        int[] iArr2 = new int[length2];
        int i27 = i21;
        while (i27 < length2) {
            float f14 = fArr4[i27];
            int binarySearch = Arrays.binarySearch(fArr, f14);
            int binarySearch2 = Arrays.binarySearch(fArr2, f14);
            if (binarySearch >= 0 && binarySearch2 <= 0) {
                int i28 = iArr[binarySearch];
                if (size >= i13 && f14 > fArr2[i21]) {
                    for (int i29 = 1; i29 < size; i29++) {
                        float f15 = fArr2[i29];
                        if (f15 >= f14 || i29 == size - 1) {
                            if (f15 <= f14) {
                                e = fArr3[i29];
                            } else {
                                int i30 = i29 - 1;
                                float f16 = fArr2[i30];
                                e = g.e(fArr3[i30], fArr3[i29], (f14 - f16) / (f15 - f16));
                            }
                            argb = Color.argb((int) (e * 255.0f), Color.red(i28), Color.green(i28), Color.blue(i28));
                        }
                    }
                    q.x.n("Unreachable code.");
                    return null;
                }
                argb = Color.argb((int) (fArr3[i21] * 255.0f), Color.red(i28), Color.green(i28), Color.blue(i28));
                iArr2[i27] = argb;
            } else {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                float f17 = fArr3[binarySearch2];
                if (i14 >= 2 && f14 != fArr[i21]) {
                    for (int i31 = 1; i31 < i14; i31++) {
                        float f18 = fArr[i31];
                        if (f18 >= f14 || i31 == i14 - 1) {
                            if (i31 == i14 - 1 && f14 >= f18) {
                                i10 = Color.argb((int) (f17 * 255.0f), Color.red(iArr[i31]), Color.green(iArr[i31]), Color.blue(iArr[i31]));
                            } else {
                                int i32 = i31 - 1;
                                float f19 = fArr[i32];
                                int i33 = iArr[i31];
                                int c10 = f.c(iArr[i32], i33, (f14 - f19) / (f18 - f19));
                                i10 = Color.argb((int) (f17 * 255.0f), Color.red(c10), Color.green(c10), Color.blue(c10));
                            }
                        }
                    }
                    q.x.n("Unreachable code.");
                    return null;
                }
                i10 = iArr[i21];
                iArr2[i27] = i10;
            }
            i27++;
            i13 = 2;
        }
        return new c(fArr4, iArr2);
    }

    public float e(float f10, float f11) {
        int i = ((this.f2825v * 1103515245) + 12345) & Integer.MAX_VALUE;
        this.f2825v = i;
        return ((i / 2.14748365E9f) * (f11 - f10)) + f10;
    }

    public int g() {
        int i = this.f2825v;
        if (i != 2) {
            if (i != 5) {
                if (i != 29) {
                    if (i != 42) {
                        if (i != 22) {
                            if (i != 23) {
                                return 0;
                            }
                            return 15;
                        }
                        return 1073741824;
                    }
                    return 16;
                }
                return 12;
            }
            return 11;
        }
        return 10;
    }

    @Override // q.n1
    public q.q i(long j10, q.q qVar, q.q qVar2, q.q qVar3) {
        if (j10 < this.f2825v * 1000000) {
            return qVar;
        }
        return qVar2;
    }

    @Override // com.google.android.gms.internal.ads.n80, com.google.android.gms.internal.ads.ie0
    /* renamed from: l */
    public /* synthetic */ void mo205l(Object obj) {
        switch (this.f2824u) {
            case 3:
                ((m) obj).i4(this.f2825v);
                return;
            case 7:
                ((hu1) obj).b(this.f2825v);
                return;
            case 8:
                ((hu1) obj).d(this.f2825v);
                return;
            default:
                ((hu1) obj).a(this.f2825v);
                return;
        }
    }

    @Override // q.p1
    public int q() {
        return this.f2825v;
    }

    @Override // q.p1
    public int s() {
        return 0;
    }

    public /* synthetic */ u4(int i, int i10) {
        this.f2824u = i10;
        this.f2825v = i;
    }

    public /* synthetic */ u4(gu1 gu1Var, int i) {
        this.f2824u = 8;
        this.f2825v = i;
    }

    public /* synthetic */ u4(gu1 gu1Var, int i, long j10) {
        this.f2824u = 7;
        this.f2825v = i;
    }

    public /* synthetic */ u4(gu1 gu1Var, int i, ze zeVar, ze zeVar2) {
        this.f2824u = 9;
        this.f2825v = i;
    }

    @Override // q.n1
    public q.q m(long j10, q.q qVar, q.q qVar2, q.q qVar3) {
        return qVar3;
    }
}
