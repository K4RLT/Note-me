package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zt;
import g9.c;
import g9.n;
import g9.p;
import l9.i;
import oa.b;

/* loaded from: classes.dex */
public final class AdActivity extends Activity {

    /* renamed from: u, reason: collision with root package name */
    public zt f4256u;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i10, Intent intent) {
        try {
            zt ztVar = this.f4256u;
            if (ztVar != null) {
                ztVar.W3(i, i10, intent);
            }
        } catch (Exception e) {
            i.i(e, "#007 Could not call remote method.");
        }
        super.onActivityResult(i, i10, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zt ztVar = this.f4256u;
            if (ztVar != null) {
                if (!ztVar.b()) {
                    return;
                }
            }
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
        super.onBackPressed();
        try {
            zt ztVar2 = this.f4256u;
            if (ztVar2 != null) {
                ztVar2.k();
            }
        } catch (RemoteException e8) {
            i.i(e8, "#007 Could not call remote method.");
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zt ztVar = this.f4256u;
            if (ztVar != null) {
                ztVar.Y(new b(configuration));
            }
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i.a("AdActivity onCreate");
        n nVar = p.f17688g.f17690b;
        nVar.getClass();
        c cVar = new c(nVar, this);
        Intent intent = getIntent();
        boolean z3 = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            i.c("useClientJar flag not found in activity intent extras.");
        } else {
            z3 = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        zt ztVar = (zt) cVar.d(this, z3);
        this.f4256u = ztVar;
        if (ztVar != null) {
            try {
                ztVar.F0(bundle);
                return;
            } catch (RemoteException e) {
                i.i(e, "#007 Could not call remote method.");
                finish();
                return;
            }
        }
        i.i(null, "#007 Could not call remote method.");
        finish();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        i.a("AdActivity onDestroy");
        try {
            zt ztVar = this.f4256u;
            if (ztVar != null) {
                ztVar.f0();
            }
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        i.a("AdActivity onPause");
        try {
            zt ztVar = this.f4256u;
            if (ztVar != null) {
                ztVar.i();
            }
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            zt ztVar = this.f4256u;
            if (ztVar != null) {
                ztVar.Q1(i, strArr, iArr);
            }
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        i.a("AdActivity onRestart");
        try {
            zt ztVar = this.f4256u;
            if (ztVar != null) {
                ztVar.d();
            }
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        i.a("AdActivity onResume");
        super.onResume();
        try {
            zt ztVar = this.f4256u;
            if (ztVar != null) {
                ztVar.f();
            }
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            zt ztVar = this.f4256u;
            if (ztVar != null) {
                ztVar.c2(bundle);
            }
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        i.a("AdActivity onStart");
        try {
            zt ztVar = this.f4256u;
            if (ztVar != null) {
                ztVar.g();
            }
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        i.a("AdActivity onStop");
        try {
            zt ztVar = this.f4256u;
            if (ztVar != null) {
                ztVar.D();
            }
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zt ztVar = this.f4256u;
            if (ztVar != null) {
                ztVar.a();
            }
        } catch (RemoteException e) {
            i.i(e, "#007 Could not call remote method.");
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        zt ztVar = this.f4256u;
        if (ztVar != null) {
            try {
                ztVar.Q0();
            } catch (RemoteException e) {
                i.i(e, "#007 Could not call remote method.");
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        zt ztVar = this.f4256u;
        if (ztVar != null) {
            try {
                ztVar.Q0();
            } catch (RemoteException e) {
                i.i(e, "#007 Could not call remote method.");
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zt ztVar = this.f4256u;
        if (ztVar != null) {
            try {
                ztVar.Q0();
            } catch (RemoteException e) {
                i.i(e, "#007 Could not call remote method.");
            }
        }
    }
}
