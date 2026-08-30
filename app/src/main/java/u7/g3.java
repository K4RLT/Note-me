package u7;
import q.x;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import wa.b9;
import ya.ac;

/* loaded from: classes.dex */
public final class g3 extends ve.i implements df.p {
    public final /* synthetic */ float A;
    public final /* synthetic */ int B;

    /* renamed from: u, reason: collision with root package name */
    public int f26222u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ m3 f26223v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f26224w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f26225x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Context f26226y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ float f26227z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(m3 m3Var, int i, int i10, Context context, float f10, float f11, int i11, te.c cVar) {
        super(2, cVar);
        this.f26223v = m3Var;
        this.f26224w = i;
        this.f26225x = i10;
        this.f26226y = context;
        this.f26227z = f10;
        this.A = f11;
        this.B = i11;
    }

    public static final int j(int i, int i10) {
        int i11 = i >>> 24;
        int i12 = i10 >>> 24;
        if (i11 < 12 && i12 < 12) {
            return 0;
        }
        return ac.b(Math.abs(i11 - i12), Math.abs(((i >>> 16) & 255) - ((i10 >>> 16) & 255)), Math.abs(((i >>> 8) & 255) - ((i10 >>> 8) & 255)), Math.abs((i & 255) - (i10 & 255)));
    }

    public static final void k(boolean[] zArr, int[] iArr, int[] iArr2, int i, ArrayList arrayList, int i10, int i11) {
        if (zArr[i11] || j(iArr[i11], i10) < 24) {
            return;
        }
        zArr[i11] = true;
        iArr2[i11] = l(iArr2[i11], i);
        arrayList.add(Integer.valueOf(i11));
    }

    public static final int l(int i, int i10) {
        int i11 = i >>> 24;
        if (i11 == 255) {
            return i;
        }
        if (i11 == 0) {
            return i10;
        }
        int i12 = ((255 - i11) * (i10 >>> 24)) / 255;
        int i13 = i11 + i12;
        if (i13 == 0) {
            return 0;
        }
        int i14 = ((((i10 >>> 16) & 255) * i12) + (((i >>> 16) & 255) * i11)) / i13;
        int i15 = ((((i10 >>> 8) & 255) * i12) + (((i >>> 8) & 255) * i11)) / i13;
        return (i13 << 24) | (i14 << 16) | (i15 << 8) | ((((i10 & 255) * i12) + ((i & 255) * i11)) / i13);
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new g3(this.f26223v, this.f26224w, this.f26225x, this.f26226y, this.f26227z, this.A, this.B, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g3) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        boolean[] zArr;
        int i13;
        pe.z zVar;
        Bitmap h02;
        int i14 = this.f26222u;
        pe.z zVar2 = pe.z.f22715a;
        boolean z3 = true;
        if (i14 != 0) {
            if (i14 == 1) {
                pe.a.e(obj);
                return zVar2;
            }
            x.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        pe.a.e(obj);
        m3 m3Var = this.f26223v;
        int i15 = this.f26224w;
        int i16 = this.f26225x;
        int k3 = m3Var.k(i15, i16);
        Context context = this.f26226y;
        Bitmap g02 = m3Var.g0(i15, i16, k3, context);
        int width = g02.getWidth();
        int height = g02.getHeight();
        int i17 = width * height;
        int[] iArr2 = new int[i17];
        g02.getPixels(iArr2, 0, width, 0, 0, width, height);
        int j10 = m3Var.j(i15, i16);
        List list = a.f25881a;
        int i18 = j10 * 2;
        if (m3Var.k0(i15, i16, i18, context) && (h02 = m3Var.h0(i15, i16, i18, context)) != null) {
            i = 0;
            int[] iArr3 = new int[i17];
            h02.getPixels(iArr3, 0, width, 0, 0, width, height);
            i10 = height;
            for (int i19 = 0; i19 < i17; i19++) {
                iArr3[i19] = l(iArr2[i19], iArr3[i19]);
            }
            iArr = iArr3;
        } else {
            i = 0;
            i10 = height;
            iArr = iArr2;
        }
        int i20 = width - 1;
        int i21 = i10 - 1;
        int e = (b9.e((int) (this.A * i10), i, i21) * width) + b9.e((int) (this.f26227z * width), i, i20);
        int i22 = iArr[e];
        int i23 = this.B;
        if (j(i22, i23) < 8) {
            return zVar2;
        }
        boolean[] zArr2 = new boolean[i17];
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new Integer(e));
        while (!arrayDeque.isEmpty()) {
            Object poll = arrayDeque.poll();
            poll.getClass();
            int intValue = ((Number) poll).intValue();
            int i24 = intValue / width;
            int i25 = intValue % width;
            boolean z9 = z3;
            while (true) {
                if (i25 >= 0) {
                    int i26 = (i24 * width) + i25;
                    i13 = i25;
                    if (j(iArr[i26], i22) >= 24 || zArr2[i26]) {
                        break;
                    }
                    i25 = i13 - 1;
                } else {
                    i13 = i25;
                    break;
                }
            }
            int i27 = i13 + 1;
            boolean z10 = false;
            boolean z11 = false;
            while (i27 < width) {
                int i28 = (i24 * width) + i27;
                int i29 = i27;
                if (j(iArr[i28], i22) < 24 && !zArr2[i28]) {
                    iArr2[i28] = i23;
                    zArr2[i28] = z9;
                    if (i24 > 0) {
                        int i30 = ((i24 - 1) * width) + i29;
                        zVar = zVar2;
                        if (j(iArr[i30], i22) < 24 && !zArr2[i30]) {
                            if (!z10) {
                                arrayDeque.add(new Integer(i30));
                                z10 = z9;
                            }
                        } else {
                            z10 = false;
                        }
                    } else {
                        zVar = zVar2;
                    }
                    if (i24 < i21) {
                        int i31 = ((i24 + 1) * width) + i29;
                        if (j(iArr[i31], i22) < 24 && !zArr2[i31]) {
                            if (!z11) {
                                arrayDeque.add(new Integer(i31));
                                z11 = z9;
                            }
                        } else {
                            z11 = false;
                        }
                    }
                    i27 = i29 + 1;
                    zVar2 = zVar;
                }
                z3 = z9;
            }
            z3 = z9;
        }
        pe.z zVar3 = zVar2;
        boolean z12 = z3;
        ArrayList arrayList = new ArrayList();
        for (int i32 = 0; i32 < i17; i32++) {
            if (zArr2[i32]) {
                int i33 = i32 / width;
                int i34 = i32 % width;
                if ((i34 > 0 && !zArr2[i32 - 1]) || ((i34 < i20 && !zArr2[i32 + 1]) || ((i33 > 0 && !zArr2[i32 - width]) || (i33 < i21 && !zArr2[i32 + width])))) {
                    arrayList.add(new Integer(i32));
                }
            }
        }
        int i35 = 0;
        while (i35 < 6) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                int intValue2 = ((Number) next).intValue();
                int i36 = intValue2 / width;
                int i37 = intValue2 % width;
                int i38 = this.B;
                if (i37 > 0) {
                    i11 = i22;
                    i12 = i38;
                    zArr = zArr2;
                    k(zArr, iArr, iArr2, i12, arrayList2, i11, intValue2 - 1);
                } else {
                    i11 = i22;
                    i12 = i38;
                    zArr = zArr2;
                }
                if (i37 < i20) {
                    k(zArr, iArr, iArr2, i12, arrayList2, i11, intValue2 + 1);
                }
                if (i36 > 0) {
                    k(zArr, iArr, iArr2, i12, arrayList2, i11, intValue2 - width);
                }
                if (i36 < i21) {
                    k(zArr, iArr, iArr2, i12, arrayList2, i11, intValue2 + width);
                }
                zArr2 = zArr;
                i22 = i11;
            }
            i35++;
            arrayList = arrayList2;
        }
        wf.e eVar = pf.l0.f22767a;
        qf.d dVar = uf.n.f27235a;
        f3 f3Var = new f3(g02, iArr2, width, i10, m3Var, this.f26224w, this.f26225x, this.f26226y, null);
        this.f26222u = z12 ? 1 : 0;
        Object J = pf.b0.J(dVar, f3Var, this);
        ue.a aVar = ue.a.f27192u;
        if (J == aVar) {
            return aVar;
        }
        return zVar3;
    }
}
