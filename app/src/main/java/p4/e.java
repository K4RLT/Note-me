package p4;
import a.a;

import android.util.Log;
import android.view.MotionEvent;
import com.google.android.gms.internal.ads.f3;
import com.google.android.gms.internal.ads.o80;
import com.google.android.gms.internal.measurement.f;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final d f22405a;

    /* renamed from: b, reason: collision with root package name */
    public final q4.a f22406b;

    /* renamed from: c, reason: collision with root package name */
    public long f22407c;

    /* renamed from: d, reason: collision with root package name */
    public double f22408d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedList f22409f;

    /* renamed from: g, reason: collision with root package name */
    public int f22410g;

    /* renamed from: h, reason: collision with root package name */
    public double f22411h;
    public final q4.a i;

    /* renamed from: j, reason: collision with root package name */
    public final q4.a f22412j;

    /* renamed from: k, reason: collision with root package name */
    public final q4.a f22413k;

    /* renamed from: l, reason: collision with root package name */
    public final q4.a f22414l;

    /* renamed from: m, reason: collision with root package name */
    public final int f22415m;

    /* renamed from: n, reason: collision with root package name */
    public final int f22416n;

    /* renamed from: o, reason: collision with root package name */
    public double f22417o;

    /* renamed from: p, reason: collision with root package name */
    public double f22418p;

    /* renamed from: q, reason: collision with root package name */
    public double f22419q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f22420r;

    /* renamed from: s, reason: collision with root package name */
    public final int f22421s;

    /* JADX WARN: Type inference failed for: r1v0, types: [q4.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [q4.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [q4.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [q4.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [q4.a, java.lang.Object] */
    public e(int i, int i10, int i11) {
        d dVar = new d();
        this.f22405a = dVar;
        this.f22406b = new Object();
        this.f22409f = new LinkedList();
        this.f22410g = -1;
        this.f22411h = 0.0d;
        this.i = new Object();
        this.f22412j = new Object();
        this.f22413k = new Object();
        this.f22414l = new Object();
        this.f22417o = 0.0d;
        this.f22418p = 0.0d;
        this.f22419q = 0.0d;
        this.f22421s = i;
        o80 o80Var = dVar.f22394a;
        Arrays.fill(((q4.b) o80Var.f9020a).f23451c, 0.0d);
        q4.b.g((q4.b) o80Var.f9021b);
        o80 o80Var2 = dVar.f22395b;
        Arrays.fill(((q4.b) o80Var2.f9020a).f23451c, 0.0d);
        q4.b.g((q4.b) o80Var2.f9021b);
        o80 o80Var3 = dVar.f22396c;
        Arrays.fill(((q4.b) o80Var3.f9020a).f23451c, 0.0d);
        q4.b.g((q4.b) o80Var3.f9021b);
        dVar.f22401j = 0;
        this.f22407c = 0L;
        this.f22408d = 0.0d;
        this.e = 0L;
        this.f22415m = i10;
        this.f22416n = i11;
        this.f22420r = o4.a().f21768a;
    }

    public final void a(MotionEvent motionEvent) {
        long j10;
        f fVar;
        q4.a aVar;
        q4.a aVar2;
        int i;
        char c10;
        e eVar;
        e eVar2 = this;
        int actionMasked = motionEvent.getActionMasked();
        long j11 = 0;
        d dVar = eVar2.f22405a;
        int i10 = 0;
        if (actionMasked == 3) {
            o80 o80Var = dVar.f22394a;
            Arrays.fill(((q4.b) o80Var.f9020a).f23451c, 0.0d);
            q4.b.g((q4.b) o80Var.f9021b);
            o80 o80Var2 = dVar.f22395b;
            Arrays.fill(((q4.b) o80Var2.f9020a).f23451c, 0.0d);
            q4.b.g((q4.b) o80Var2.f9021b);
            o80 o80Var3 = dVar.f22396c;
            Arrays.fill(((q4.b) o80Var3.f9020a).f23451c, 0.0d);
            q4.b.g((q4.b) o80Var3.f9021b);
            dVar.f22401j = 0;
            eVar2.f22407c = 0L;
            eVar2.f22408d = 0.0d;
            return;
        }
        int i11 = eVar2.f22415m;
        int findPointerIndex = motionEvent.findPointerIndex(i11);
        if (findPointerIndex == -1) {
            Locale locale = Locale.ROOT;
            Log.i("SinglePointerPredictor", "onTouchEvent: Cannot find pointerId=" + i11 + " in motionEvent=" + motionEvent);
            return;
        }
        eVar2.e = motionEvent.getDownTime();
        f fVar2 = new f(new a(motionEvent), 1);
        while (fVar2.hasNext()) {
            f3 f3Var = (f3) fVar2.next();
            MotionEvent.PointerCoords pointerCoords = ((MotionEvent.PointerCoords[]) f3Var.f5900w)[findPointerIndex];
            float f10 = pointerCoords.x;
            float f11 = pointerCoords.y;
            float f12 = pointerCoords.pressure;
            float f13 = pointerCoords.orientation;
            float axisValue = pointerCoords.getAxisValue(25);
            long j12 = j11;
            long j13 = f3Var.f5899v;
            double d2 = f10;
            q4.a aVar3 = eVar2.f22406b;
            int i12 = findPointerIndex;
            if (d2 == aVar3.f23447a) {
                j10 = j13;
                if (f11 == aVar3.f23448b && j10 <= eVar2.f22407c + 20) {
                    eVar = eVar2;
                    fVar = fVar2;
                    i = i10;
                    c10 = 3;
                    i10 = i;
                    eVar2 = eVar;
                    j11 = j12;
                    findPointerIndex = i12;
                    fVar2 = fVar;
                }
            } else {
                j10 = j13;
            }
            q4.a aVar4 = dVar.f22399g;
            q4.a aVar5 = dVar.f22398f;
            q4.a aVar6 = dVar.e;
            q4.a aVar7 = dVar.f22397d;
            q4.b bVar = dVar.f22404m;
            q4.b bVar2 = dVar.f22403l;
            fVar = fVar2;
            q4.b bVar3 = dVar.f22402k;
            o80 o80Var4 = dVar.f22396c;
            o80 o80Var5 = dVar.f22395b;
            o80 o80Var6 = dVar.f22394a;
            if (dVar.f22401j == 0) {
                i = 0;
                ((q4.b) o80Var6.f9020a).f(0, 0, d2);
                aVar = aVar4;
                aVar2 = aVar5;
                ((q4.b) o80Var5.f9020a).f(0, 0, f11);
                ((q4.b) o80Var4.f9020a).f(0, 0, f12);
            } else {
                aVar = aVar4;
                aVar2 = aVar5;
                i = 0;
                bVar3.f(0, 0, d2);
                o80Var6.a();
                o80Var6.b(bVar3);
                bVar2.f(0, 0, f11);
                o80Var5.a();
                o80Var5.b(bVar2);
                bVar.f(0, 0, f12);
                o80Var4.a();
                o80Var4.b(bVar);
            }
            dVar.f22401j++;
            aVar7.f23447a = ((q4.b) o80Var6.f9020a).c(i, i);
            aVar7.f23448b = ((q4.b) o80Var5.f9020a).c(i, i);
            aVar6.f23447a = ((q4.b) o80Var6.f9020a).c(1, i);
            aVar6.f23448b = ((q4.b) o80Var5.f9020a).c(1, i);
            q4.a aVar8 = aVar2;
            aVar8.f23447a = ((q4.b) o80Var6.f9020a).c(2, i);
            aVar8.f23448b = ((q4.b) o80Var5.f9020a).c(2, i);
            c10 = 3;
            q4.a aVar9 = aVar;
            aVar9.f23447a = ((q4.b) o80Var6.f9020a).c(3, i);
            aVar9.f23448b = ((q4.b) o80Var5.f9020a).c(3, i);
            dVar.f22400h = ((q4.b) o80Var4.f9020a).c(i, i);
            dVar.i = ((q4.b) o80Var4.f9020a).c(1, i);
            aVar3.f23447a = d2;
            aVar3.f23448b = f11;
            eVar = this;
            eVar.f22418p = f13;
            eVar.f22419q = axisValue;
            LinkedList linkedList = eVar.f22409f;
            if (linkedList != null && linkedList.size() < 20) {
                if (eVar.f22407c > j12) {
                    eVar.f22409f.add(Double.valueOf(j10 - r0));
                    Iterator it = eVar.f22409f.iterator();
                    double d10 = 0.0d;
                    while (it.hasNext()) {
                        d10 += ((Double) it.next()).doubleValue();
                    }
                    eVar.f22411h = d10 / eVar.f22409f.size();
                }
            }
            eVar.f22407c = j10;
            i10 = i;
            eVar2 = eVar;
            j11 = j12;
            findPointerIndex = i12;
            fVar2 = fVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.MotionEvent b(int r41) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.e.b(int):android.view.MotionEvent");
    }
}
