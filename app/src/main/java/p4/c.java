package p4;

import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import com.google.android.gms.internal.ads.f3;
import com.google.android.gms.internal.measurement.f;
import java.lang.reflect.Array;
import java.util.Locale;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f22391c = Log.isLoggable("MultiPointerPredictor", 3);

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f22392a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final int f22393b;

    public c(int i) {
        this.f22393b = i;
    }

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        SparseArray sparseArray = this.f22392a;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked == 1) {
                e eVar = (e) sparseArray.get(pointerId);
                if (eVar != null) {
                    sparseArray.remove(pointerId);
                    eVar.a(motionEvent);
                }
                sparseArray.clear();
                return;
            }
            if (actionMasked == 6) {
                e eVar2 = (e) sparseArray.get(pointerId);
                if (eVar2 != null) {
                    sparseArray.remove(pointerId);
                    eVar2.a(motionEvent);
                    return;
                }
                return;
            }
            if (actionMasked == 3) {
                sparseArray.clear();
                return;
            } else {
                if (actionMasked == 2) {
                    for (int i = 0; i < sparseArray.size(); i++) {
                        ((e) sparseArray.valueAt(i)).a(motionEvent);
                    }
                    return;
                }
                return;
            }
        }
        e eVar3 = new e(this.f22393b, pointerId, motionEvent.getToolType(actionIndex));
        eVar3.a(motionEvent);
        sparseArray.put(pointerId, eVar3);
    }

    public final MotionEvent b(int i) {
        SparseArray sparseArray = this.f22392a;
        int size = sparseArray.size();
        boolean z3 = f22391c;
        if (size == 0) {
            if (z3) {
                Log.d("MultiPointerPredictor", "predict() -> null: no pointer on screen");
                return null;
            }
        } else {
            if (size == 1) {
                MotionEvent b10 = ((e) sparseArray.valueAt(0)).b(i);
                if (z3) {
                    Log.d("MultiPointerPredictor", "predict() -> MotionEvent: " + b10);
                }
                return b10;
            }
            int[] iArr = new int[size];
            MotionEvent[] motionEventArr = new MotionEvent[size];
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = sparseArray.keyAt(i10);
                motionEventArr[i10] = ((e) sparseArray.valueAt(i10)).b(i);
            }
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < size; i12++) {
                MotionEvent motionEvent = motionEventArr[i12];
                if (motionEvent == null) {
                    for (int i13 = 0; i13 < size; i13++) {
                        MotionEvent motionEvent2 = motionEventArr[i13];
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                    }
                } else {
                    if (motionEvent.getHistorySize() < i11) {
                        i11 = motionEvent.getHistorySize();
                    }
                }
            }
            int i14 = i11 + 1;
            MotionEvent.PointerCoords[][] pointerCoordsArr = (MotionEvent.PointerCoords[][]) Array.newInstance((Class<?>) MotionEvent.PointerCoords.class, i14, size);
            long[] jArr = new long[i14];
            for (int i15 = 0; i15 < size; i15++) {
                f fVar = new f(new a(motionEventArr[i15]), 1);
                int i16 = 0;
                while (fVar.hasNext()) {
                    f3 f3Var = (f3) fVar.next();
                    pointerCoordsArr[i16][i15] = ((MotionEvent.PointerCoords[]) f3Var.f5900w)[0];
                    jArr[i16] = f3Var.f5899v;
                    i16++;
                    if (i14 <= i16) {
                        break;
                    }
                }
            }
            for (int i17 = 0; i17 < size; i17++) {
                motionEventArr[i17].recycle();
            }
            MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[size];
            for (int i18 = 0; i18 < size; i18++) {
                MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
                pointerPropertiesArr[i18] = pointerProperties;
                pointerProperties.id = iArr[i18];
            }
            MotionEvent obtain = MotionEvent.obtain(motionEventArr[0].getDownTime(), jArr[0], 2, size, pointerPropertiesArr, pointerCoordsArr[0], 0, 0, 1.0f, 1.0f, 0, 0, 0, 0);
            for (int i19 = 1; i19 < i14; i19++) {
                obtain.addBatch(jArr[i19], pointerCoordsArr[i19], 0);
            }
            if (z3) {
                Locale locale = Locale.ROOT;
                StringBuilder sb2 = new StringBuilder(g3.a.j("predict() -> MotionEvent: (pointerCount=", obtain.getPointerCount(), ", historySize=", ");", obtain.getHistorySize()));
                f fVar2 = new f(new a(obtain), 1);
                while (fVar2.hasNext()) {
                    f3 f3Var2 = (f3) fVar2.next();
                    sb2.append("      ");
                    for (MotionEvent.PointerCoords pointerCoords : (MotionEvent.PointerCoords[]) f3Var2.f5900w) {
                        sb2.append(String.format(Locale.ROOT, "(%f, %f)", Float.valueOf(pointerCoords.x), Float.valueOf(pointerCoords.y)));
                    }
                    sb2.append("\n");
                }
                Log.d("MultiPointerPredictor", sb2.toString());
            }
            return obtain;
        }
        return null;
    }
}
