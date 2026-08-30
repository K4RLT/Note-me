package ya;
import a1.f;
import b1.h;
import b4.b;
import eb.j1;
import fa.y;
import ib.i;
import ib.o;
import je.e;
import je.g;
import p7.n;
import pd.c;
import pf.l;

import com.google.mlkit.vision.digitalink.recognition.internal.DigitalInkRecognizerJni;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class o9 {

    /* renamed from: a, reason: collision with root package name */
    public static b f31411a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f31412b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f31413c;

    /* renamed from: d, reason: collision with root package name */
    public static String f31414d;

    public static Object a(ArrayList arrayList, float f10, float f11, String str, n nVar) {
        boolean z3;
        o b10;
        boolean z9;
        l lVar = new l(1, rc.b(nVar));
        lVar.s();
        int i = 0;
        g gVar = new g(lVar, 0);
        str.getClass();
        b bVar = f31411a;
        if (bVar != null && f31412b && !arrayList.isEmpty()) {
            com.google.android.gms.internal.mlkit_vision_digital_ink.e4 e4Var = com.google.android.gms.internal.mlkit_vision_digital_ink.h4.f14393v;
            int i10 = 4;
            String str2 = "initialCapacity";
            com.google.android.gms.internal.mlkit_vision_digital_ink.n5.d(4, "initialCapacity");
            Object[] objArr = new Object[4];
            Iterator it = arrayList.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                List<f> list = (List) it.next();
                if (!list.isEmpty()) {
                    com.google.android.gms.internal.mlkit_vision_digital_ink.e4 e4Var2 = com.google.android.gms.internal.mlkit_vision_digital_ink.h4.f14393v;
                    com.google.android.gms.internal.mlkit_vision_digital_ink.n5.d(i10, str2);
                    Object[] objArr2 = new Object[i10];
                    int i12 = i;
                    for (f fVar : list) {
                        String str3 = str2;
                        g gVar2 = new g(fVar.f22475a, fVar.f22476b, Long.valueOf(fVar.f22477c));
                        int length = objArr2.length;
                        int i13 = i12 + 1;
                        int b11 = com.google.android.gms.internal.mlkit_vision_digital_ink.b(length, i13);
                        if (b11 > length) {
                            objArr2 = Arrays.copyOf(objArr2, b11);
                        }
                        objArr2[i12] = gVar2;
                        i12 = i13;
                        str2 = str3;
                    }
                    String str4 = str2;
                    h hVar = new h(com.google.android.gms.internal.mlkit_vision_digital_ink.h4.r(objArr2, i12));
                    int length2 = objArr.length;
                    int i14 = i11 + 1;
                    int b12 = com.google.android.gms.internal.mlkit_vision_digital_ink.b(length2, i14);
                    if (b12 > length2) {
                        objArr = Arrays.copyOf(objArr, b12);
                    }
                    objArr[i11] = hVar;
                    i11 = i14;
                    str2 = str4;
                    i = 0;
                    i10 = 4;
                }
            }
            if (f10 > 0.0f && f11 > 0.0f) {
                int length3 = str.length();
                int i15 = 20;
                if (20 > length3) {
                    i15 = length3;
                }
                i iVar = new i(str.substring(length3 - i15), new e(f10, f11));
                f fVar2 = new f(com.google.android.gms.internal.mlkit_vision_digital_ink.h4.r(objArr, i11));
                DigitalInkRecognizerJni digitalInkRecognizerJni = (DigitalInkRecognizerJni) bVar.f20334u.get();
                if (digitalInkRecognizerJni != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                y.j("Recognizer has been closed", z9);
                b10 = digitalInkRecognizerJni.b(bVar.f20336w, new j1(bVar, digitalInkRecognizerJni, fVar2, iVar), (c) bVar.f20337x.f22681u);
            } else {
                f fVar3 = new f(com.google.android.gms.internal.mlkit_vision_digital_ink.h4.r(objArr, i11));
                AtomicReference atomicReference = bVar.f20334u;
                i iVar2 = b.f20333y;
                DigitalInkRecognizerJni digitalInkRecognizerJni2 = (DigitalInkRecognizerJni) atomicReference.get();
                if (digitalInkRecognizerJni2 != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                y.j("Recognizer has been closed", z3);
                b10 = digitalInkRecognizerJni2.b(bVar.f20336w, new j1(bVar, digitalInkRecognizerJni2, fVar3, iVar2), (c) bVar.f20337x.f22681u);
            }
            b10.getClass();
            b10.f(i.f18364a, new h(18, new f(15, gVar)));
            b10.d(new h(19, gVar));
        } else {
            gVar.invoke(null);
        }
        return lVar.r();
    }
}
