package c9;
import f.a;

import android.os.Parcel;
import android.os.Parcelable;
import ca.r;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.gl;
import eb.b3;
import eb.k3;
import eb.o3;
import eb.t;
import eb.u;
import f.i;
import fa.g0;
import fa.k;
import fa.m;
import fa.n;
import fa.s;
import wa.e7;

/* loaded from: classes.dex */
public final class f implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4016a;

    public /* synthetic */ f(int i) {
        this.f4016a = i;
    }

    public static void a(fa.g gVar, Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        int i10 = gVar.f16857u;
        e7.j(parcel, 1, 4);
        parcel.writeInt(i10);
        int i11 = gVar.f16858v;
        e7.j(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = gVar.f16859w;
        e7.j(parcel, 3, 4);
        parcel.writeInt(i12);
        e7.e(parcel, 4, gVar.f16860x);
        e7.c(parcel, 5, gVar.f16861y);
        e7.h(parcel, 6, gVar.f16862z, i);
        e7.a(parcel, 7, gVar.A);
        e7.d(parcel, 8, gVar.B, i);
        e7.h(parcel, 10, gVar.C, i);
        e7.h(parcel, 11, gVar.D, i);
        boolean z3 = gVar.E;
        e7.j(parcel, 12, 4);
        parcel.writeInt(z3 ? 1 : 0);
        int i13 = gVar.F;
        e7.j(parcel, 13, 4);
        parcel.writeInt(i13);
        boolean z9 = gVar.G;
        e7.j(parcel, 14, 4);
        parcel.writeInt(z9 ? 1 : 0);
        e7.e(parcel, 15, gVar.H);
        e7.l(parcel, k3);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
//         jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 833
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r54) {
        /*
            Method dump skipped, instructions count: 2634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.f.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f4016a) {
            case 0:
                return new a[i];
            case 1:
                return new d[i];
            case 2:
                return new ca.b[i];
            case 3:
                return new ca.d[i];
            case 4:
                return new r[i];
            case 5:
                return new Scope[i];
            case 6:
                return new Status[i];
            case 7:
                return new eb.d[i];
            case 8:
                return new eb.g[i];
            case 9:
                return new t[i];
            case 10:
                return new u[i];
            case 11:
                return new b3[i];
            case 12:
                return new o3[i];
            case 13:
                return new k3[i];
            case 14:
                return new a[i];
            case 15:
                return new i[i];
            case 16:
                return new f9.f[i];
            case 17:
                return new n[i];
            case 18:
                return new k[i];
            case 19:
                return new fa.r[i];
            case 20:
                return new s[i];
            case gl.zzm /* 21 */:
                return new m[i];
            case 22:
                return new g0[i];
            case 23:
                return new fa.f[i];
            case 24:
                return new fa.g[i];
            case 25:
                return new WrappedParcelable[i];
            case 26:
                return new gb.b[i];
            case 27:
                return new gb.d[i];
            case 28:
                return new gb.e[i];
            default:
                return new gb.f[i];
        }
    }
}
