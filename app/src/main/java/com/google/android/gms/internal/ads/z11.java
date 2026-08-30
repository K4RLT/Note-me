package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class z11 implements z1.m1, c4.q, n9.e, s81, com.google.android.gms.internal.mlkit_vision_digital_ink.da, ib.c, mb.f {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13045u;

    /* renamed from: v, reason: collision with root package name */
    public Object f13046v;

    /* renamed from: w, reason: collision with root package name */
    public Object f13047w;

    public z11(int i) {
        this.f13045u = i;
        switch (i) {
            case 9:
                this.f13046v = new HashMap();
                return;
            case 14:
                ca.e eVar = ca.e.f4034d;
                this.f13046v = new SparseIntArray();
                this.f13047w = eVar;
                return;
            default:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f13046v = byteArrayOutputStream;
                this.f13047w = new DataOutputStream(byteArrayOutputStream);
                return;
        }
    }

    @Override // z1.m1
    public boolean a(Object obj, Object obj2) {
        b0.w wVar = (b0.w) this.f13046v;
        return kotlin.jvm.internal.l.a(wVar.b(obj), wVar.b(obj2));
    }

    @Override // mb.f
    public Object b() {
        Object b10 = ((mb.e) this.f13046v).b();
        Context context = ((c4.n) ((k6.i) this.f13047w).f19569v).f3851u;
        lb.r1 r1Var = (lb.r1) b10;
        ya.s0.a(context.getPackageManager(), new ComponentName(context.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"));
        ya.s0.a(context.getPackageManager(), new ComponentName(context.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"));
        ya.v0.a(r1Var);
        return r1Var;
    }

    @Override // z1.m1
    public void c(n.t0 t0Var) {
        int i;
        n.c0 c0Var = (n.c0) this.f13047w;
        c0Var.a();
        Iterator it = t0Var.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object b10 = ((b0.w) this.f13046v).b(next);
            int d2 = c0Var.d(b10);
            if (d2 >= 0) {
                i = c0Var.f20851c[d2];
            } else {
                i = 0;
            }
            if (i == 7) {
                t0Var.remove(next);
            } else {
                c0Var.h(i + 1, b10);
            }
        }
    }

    @Override // n9.e
    public /* synthetic */ Object d(Object obj) {
        throw new ClassCastException();
    }

    @Override // c4.q
    public boolean e(CharSequence charSequence, int i, int i10, c4.z zVar) {
        Spannable spannableString;
        if ((zVar.f3880c & 4) > 0) {
            return true;
        }
        if (((c4.c0) this.f13046v) == null) {
            if (charSequence instanceof Spannable) {
                spannableString = (Spannable) charSequence;
            } else {
                spannableString = new SpannableString(charSequence);
            }
            this.f13046v = new c4.c0(spannableString);
        }
        ((de.b) this.f13047w).getClass();
        ((c4.c0) this.f13046v).setSpan(new c4.a0(zVar), i, i10, 33);
        return true;
    }

    @Override // ib.c
    public void f(ib.o oVar) {
        ((Map) ((com.google.android.gms.internal.measurement.e4) this.f13047w).f13729w).remove((ib.h) this.f13046v);
    }

    public Object g(d3.h hVar) {
        String str;
        String str2;
        Context context = (Context) this.f13046v;
        rx0 rx0Var = (rx0) this.f13047w;
        if (Build.VERSION.SDK_INT < 31) {
            hVar.a("");
            return "";
        }
        try {
            String packageName = context.getPackageName();
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            int i = 0;
            String[] strArr = {rx0Var.a0(), "308204433082032ba003020102020900c2e08746644a308d300d06092a864886f70d01010405003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3038303832313233313333345a170d3336303130373233313333345a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820120300d06092a864886f70d01010105000382010d00308201080282010100ab562e00d83ba208ae0a966f124e29da11f2ab56d08f58e2cca91303e9b754d372f640a71b1dcb130967624e4656a7776a92193db2e5bfb724a91e77188b0e6a47a43b33d9609b77183145ccdf7b2e586674c9e1565b1f4c6a5955bff251a63dabf9c55c27222252e875e4f8154a645f897168c0b1bfc612eabf785769bb34aa7984dc7e2ea2764cae8307d8c17154d7ee5f64a51a44a602c249054157dc02cd5f5c0e55fbef8519fbe327f0b1511692c5a06f19d18385f5c4dbc2d6b93f68cc2979c70e18ab93866b3bd5db8999552a0e3b4c99df58fb918bedc182ba35e003c1b4b10dd244a8ee24fffd333872ab5221985edab0fc0d0b145b6aa192858e79020103a381d93081d6301d0603551d0e04160414c77d8cc2211756259a7fd382df6be398e4d786a53081a60603551d2304819e30819b8014c77d8cc2211756259a7fd382df6be398e4d786a5a178a4763074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964820900c2e08746644a308d300c0603551d13040530030101ff300d06092a864886f70d010104050003820101006dd252ceef85302c360aaace939bcff2cca904bb5d7a1661f8ae46b2994204d0ff4a68c7ed1a531ec4595a623ce60763b167297a7ae35712c407f208f0cb109429124d7b106219c084ca3eb3f9ad5fb871ef92269a8be28bf16d44c8d9a08e6cb2f005bb3fe2cb96447e868e731076ad45b33f6009ea19c161e62641aa99271dfd5228c5c587875ddb7f452758d661f6cc0cccb7352e424cc4365c523532f7325137593c4ae341f4db41edda0d0b1071a7c440f0fe9ea01cb627ca674369d084bd2fd911ff06cdbf2cfa10dc0f893ae35762919048c7efc64c7144178342f70581c9de573af55b390dd7fdb9418631895d5f759f30112687ff621410c069308a"};
            int i10 = 0;
            while (true) {
                if (i10 >= 2) {
                    str = "";
                    break;
                }
                str = strArr[i10];
                if (!TextUtils.isEmpty(str)) {
                    break;
                }
                i10++;
            }
            o61 o61Var = r61.f10130f;
            byte[] h3 = o61Var.f().h(str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(h3)));
            if (!Build.TYPE.equals("user")) {
                String[] strArr2 = {rx0Var.b0(), "308204a830820390a003020102020900d585b86c7dd34ef5300d06092a864886f70d0101040500308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d301e170d3038303431353233333635365a170d3335303930313233333635365a308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100d6ce2e080abfe2314dd18db3cfd3185cb43d33fa0c74e1bdb6d1db8913f62c5c39df56f846813d65bec0f3ca426b07c5a8ed5a3990c167e76bc999b927894b8f0b22001994a92915e572c56d2a301ba36fc5fc113ad6cb9e7435a16d23ab7dfaeee165e4df1f0a8dbda70a869d516c4e9d051196ca7c0c557f175bc375f948c56aae86089ba44f8aa6a4dd9a7dbf2c0a352282ad06b8cc185eb15579eef86d080b1d6189c0f9af98b1c2ebd107ea45abdb68a3c7838a5e5488c76c53d40b121de7bbd30e620c188ae1aa61dbbc87dd3c645f2f55f3d4c375ec4070a93f7151d83670c16a971abe5ef2d11890e1b8aef3298cf066bf9e6ce144ac9ae86d1c1b0f020103a381fc3081f9301d0603551d0e041604148d1cc5be954c433c61863a15b04cbc03f24fe0b23081c90603551d230481c13081be80148d1cc5be954c433c61863a15b04cbc03f24fe0b2a1819aa48197308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d820900d585b86c7dd34ef5300c0603551d13040530030101ff300d06092a864886f70d0101040500038201010019d30cf105fb78923f4c0d7dd223233d40967acfce00081d5bd7c6e9d6ed206b0e11209506416ca244939913d26b4aa0e0f524cad2bb5c6e4ca1016a15916ea1ec5dc95a5e3a010036f49248d5109bbf2e1e618186673a3be56daf0b77b1c229e3c255e3e84c905d2387efba09cbf13b202b4e5a22c93263484a23d2fc29fa9f1939759733afd8aa160f4296c2d0163e8182859c6643e9c1962fa0c18333335bc090ff9a6b22ded1ad444229a539a94eefadabd065ced24b3e51e5dd7b66787bef12fe97fba484c423fb4ff8cc494c02f0f5051612ff6529393e8e46eac5bb21f277c151aa5f2aa627d1e89da70ab6033569de3b9897bfff7ca9da3e1243f60b"};
                while (true) {
                    if (i >= 2) {
                        str2 = "";
                        break;
                    }
                    str2 = strArr2[i];
                    if (!TextUtils.isEmpty(str2)) {
                        break;
                    }
                    i++;
                }
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(o61Var.f().h(str2))));
            }
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new we(2, hVar));
            return "";
        } catch (PackageManager.NameNotFoundException | NoClassDefFoundError | CertificateException unused) {
            hVar.a("");
            return "";
        }
    }

    @Override // c4.q
    public Object getResult() {
        return (c4.c0) this.f13046v;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.datatransport.cct.CctBackendFactory h(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z11.h(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public synchronized Map i() {
        try {
            if (((Map) this.f13047w) == null) {
                this.f13047w = Collections.unmodifiableMap(new HashMap((HashMap) this.f13046v));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f13047w;
    }

    @Override // com.google.android.gms.internal.ads.s81
    /* renamed from: r */
    public void mo202r(Object obj) {
        Bundle bundle;
        switch (this.f13045u) {
            case 6:
                av avVar = (av) this.f13047w;
                dv dvVar = (dv) this.f13046v;
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                try {
                    nl nlVar = sl.J2;
                    g9.r rVar = g9.r.e;
                    if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                        if (((Boolean) rVar.f17698c.a(sl.K2)).booleanValue() && (bundle = dvVar.G) != null) {
                            f9.k.C.f16819k.getClass();
                            bundle.putLong("binder-call-start", System.currentTimeMillis());
                        }
                        avVar.e2(parcelFileDescriptor, dvVar);
                        return;
                    }
                    avVar.e3(parcelFileDescriptor);
                    return;
                } catch (RemoteException e) {
                    k9.a0.l("Service can't call client", e);
                    return;
                }
            default:
                u uVar = (u) this.f13047w;
                synchronized (uVar) {
                    try {
                        uVar.f11501y = null;
                        ((ArrayDeque) uVar.f11500x).addFirst((po0) this.f13046v);
                        if (uVar.f11497u == 1) {
                            uVar.g();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.s81
    public void t(Throwable th) {
        String message;
        switch (this.f13045u) {
            case 6:
                try {
                    av avVar = (av) this.f13047w;
                    g9.y1 g8 = x21.g(th);
                    if (xy.y(th.getMessage())) {
                        message = g8.f17715v;
                    } else {
                        message = th.getMessage();
                    }
                    avVar.b3(new k9.m(message, g8.f17714u));
                    return;
                } catch (RemoteException e) {
                    k9.a0.l("Service can't call client", e);
                    return;
                }
            default:
                u uVar = (u) this.f13047w;
                synchronized (uVar) {
                    uVar.f11501y = null;
                }
                return;
        }
    }

    @Override // n9.e
    public void z(z8.a aVar) {
        try {
            String canonicalName = ((n9.a) this.f13047w).getClass().getCanonicalName();
            int i = aVar.f31969a;
            String str = aVar.f31970b;
            String str2 = aVar.f31971c;
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 41 + String.valueOf(i).length() + 17 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
            sb2.append(canonicalName);
            sb2.append("failed to load mediation ad: ErrorCode = ");
            sb2.append(i);
            sb2.append(". ErrorMessage = ");
            sb2.append(str);
            sb2.append(". ErrorDomain = ");
            sb2.append(str2);
            l9.i.a(sb2.toString());
            as asVar = (as) this.f13046v;
            asVar.K2(aVar.a());
            asVar.o4(i, str);
            asVar.o0(i);
        } catch (RemoteException e) {
            l9.i.d("", e);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.da
    public com.google.android.gms.internal.mlkit_vision_digital_ink.ya zza() {
        hb hbVar = (hb) this.f13046v;
        com.google.android.gms.internal.mlkit_vision_digital_ink.fs fsVar = (com.google.android.gms.internal.mlkit_vision_digital_ink.fs) this.f13047w;
        com.google.android.gms.internal.mlkit_vision_digital_ink.ya s10 = hbVar.s(fsVar, false);
        com.google.android.gms.internal.mlkit_vision_digital_ink.ya s11 = hbVar.s(fsVar, true);
        return ((c7.f0) com.google.android.gms.internal.mlkit_vision_digital_ink.pa.n(s10, s11).f14961v).s(com.google.android.gms.internal.mlkit_vision_digital_ink.g2.a(new com.google.android.gms.internal.measurement.e4(13, s10, s11, false)), (Executor) hbVar.f6653y);
    }

    public /* synthetic */ z11(int i, boolean z3) {
        this.f13045u = i;
    }

    public /* synthetic */ z11(ph phVar, Object obj, Object obj2, int i) {
        this.f13045u = i;
        this.f13046v = obj;
        this.f13047w = obj2;
    }

    public /* synthetic */ z11(Object obj, int i, Object obj2) {
        this.f13045u = i;
        this.f13046v = obj;
        this.f13047w = obj2;
    }

    public /* synthetic */ z11(int i, Object obj, Object obj2, boolean z3) {
        this.f13045u = i;
        this.f13046v = obj2;
        this.f13047w = obj;
    }

    public z11(y51 y51Var, int[] iArr) {
        this.f13045u = 8;
        this.f13046v = d51.u(y51Var);
        this.f13047w = iArr;
    }

    public z11(j.i0 i0Var) {
        this.f13045u = 18;
        this.f13047w = new Object();
        this.f13046v = i0Var;
        wa.na.b();
    }

    public z11(gd.b bVar) {
        this.f13045u = 17;
        this.f13047w = Collections.synchronizedMap(new HashMap());
        this.f13046v = bVar;
    }

    public z11(b0.w wVar) {
        this.f13045u = 1;
        this.f13046v = wVar;
        n.c0 c0Var = n.m0.f20916a;
        this.f13047w = new n.c0();
    }

    public z11(Context context) {
        this.f13045u = 16;
        this.f13047w = null;
        this.f13046v = context;
    }
}
