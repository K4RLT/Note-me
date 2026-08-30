package com.google.android.gms.internal.ads;

import android.os.Parcelable;

/* loaded from: classes.dex */
public final class bj implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4803a;

    public /* synthetic */ bj(int i) {
        this.f4803a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 797
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r70) {
        /*
            Method dump skipped, instructions count: 2522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bj.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f4803a) {
            case 0:
                return new aj[i];
            case 1:
                return new dj[i];
            case 2:
                return new rn[i];
            case 3:
                return new zp[i];
            case 4:
                return new aq[i];
            case 5:
                return new eq[i];
            case 6:
                return new kq[i];
            case 7:
                return new lq[i];
            case 8:
                return new ft[i];
            case 9:
                return new nu[i];
            case 10:
                return new su[i];
            case 11:
                return new tu[i];
            case 12:
                return new uu[i];
            case 13:
                return new dv[i];
            case 14:
                return new mv[i];
            case 15:
                return new qv[i];
            case 16:
                return new hw[i];
            case 17:
                return new nw[i];
            case 18:
                return new jx[i];
            case 19:
                return new qq0[i];
            case 20:
                return new pv0[i];
            case gl.zzm /* 21 */:
                return new rv0[i];
            case 22:
                return new sv0[i];
            case 23:
                return new vv0[i];
            case 24:
                return new wv0[i];
            case 25:
                return new nu1[i];
            default:
                return new ju1[i];
        }
    }
}
