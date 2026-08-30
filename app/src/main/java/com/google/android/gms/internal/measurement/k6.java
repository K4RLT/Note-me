package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class k6 {
    public static final k4 A;
    public static final k4 B;
    public static final k4 C;
    public static final k4 D;
    public static final k4 E;
    public static final k4 F;
    public static final k4 G;
    public static final k4 H;
    public static final k4 I;
    public static final k4 J;
    public static final k4 K;
    public static final k4 L;
    public static final k4 M;
    public static final k4 N;
    public static final k4 O;
    public static final k4 P;
    public static final k4 Q;
    public static final k4 R;
    public static final k4 S;
    public static final k4 T;
    public static final k4 U;
    public static final k4 V;
    public static final k4 W;
    public static final k4 X;
    public static final k4 Y;
    public static final k4 Z;

    /* renamed from: a, reason: collision with root package name */
    public static final k4 f13804a;

    /* renamed from: b, reason: collision with root package name */
    public static final k4 f13805b;

    /* renamed from: c, reason: collision with root package name */
    public static final k4 f13806c;

    /* renamed from: d, reason: collision with root package name */
    public static final k4 f13807d;
    public static final k4 e;

    /* renamed from: f, reason: collision with root package name */
    public static final k4 f13808f;

    /* renamed from: g, reason: collision with root package name */
    public static final k4 f13809g;

    /* renamed from: h, reason: collision with root package name */
    public static final k4 f13810h;
    public static final k4 i;

    /* renamed from: j, reason: collision with root package name */
    public static final k4 f13811j;

    /* renamed from: k, reason: collision with root package name */
    public static final k4 f13812k;

    /* renamed from: l, reason: collision with root package name */
    public static final k4 f13813l;

    /* renamed from: m, reason: collision with root package name */
    public static final k4 f13814m;

    /* renamed from: n, reason: collision with root package name */
    public static final k4 f13815n;

    /* renamed from: o, reason: collision with root package name */
    public static final k4 f13816o;

    /* renamed from: p, reason: collision with root package name */
    public static final k4 f13817p;

    /* renamed from: q, reason: collision with root package name */
    public static final k4 f13818q;

    /* renamed from: r, reason: collision with root package name */
    public static final k4 f13819r;

    /* renamed from: s, reason: collision with root package name */
    public static final k4 f13820s;

    /* renamed from: t, reason: collision with root package name */
    public static final k4 f13821t;

    /* renamed from: u, reason: collision with root package name */
    public static final k4 f13822u;

    /* renamed from: v, reason: collision with root package name */
    public static final k4 f13823v;

    /* renamed from: w, reason: collision with root package name */
    public static final k4 f13824w;

    /* renamed from: x, reason: collision with root package name */
    public static final k4 f13825x;

    /* renamed from: y, reason: collision with root package name */
    public static final k4 f13826y;

    /* renamed from: z, reason: collision with root package name */
    public static final k4 f13827z;

    static {
        com.google.android.gms.internal.ads.d dVar = new com.google.android.gms.internal.ads.d(h4.a("com.google.android.gms.measurement"), "", "", true, true);
        f13804a = dVar.f(10000L, "measurement.ad_id_cache_time");
        f13805b = dVar.f(3600000L, "measurement.app_uninstalled_additional_ad_id_cache_time");
        f13806c = dVar.f(100L, "measurement.max_bundles_per_iteration");
        f13807d = dVar.f(86400000L, "measurement.config.cache_time");
        dVar.g("measurement.log_tag", "FA");
        e = dVar.g("measurement.config.url_authority", "app-measurement.com");
        f13808f = dVar.g("measurement.config.url_scheme", "https");
        f13809g = dVar.f(1000L, "measurement.upload.debug_upload_interval");
        f13810h = dVar.f(3600000L, "measurement.session.engagement_interval");
        i = dVar.g("measurement.rb.attribution.event_params", "value|currency");
        dVar.f(0L, "measurement.id.rb.attribution.app_allowlist");
        f13811j = dVar.g("measurement.sgtm.google_signal.url", "https://app-measurement.com/s");
        f13812k = dVar.f(4L, "measurement.lifetimevalue.max_currency_tracked");
        f13813l = dVar.f(1L, "measurement.dma_consent.max_daily_dcu_realtime_events");
        f13814m = dVar.f(100L, "measurement.upload.max_event_parameter_value_length");
        f13815n = dVar.f(100000L, "measurement.store.max_stored_events_per_app");
        f13816o = dVar.f(50L, "measurement.experiment.max_ids");
        f13817p = dVar.f(200L, "measurement.audience.filter_result_max_count");
        f13818q = dVar.f(27L, "measurement.upload.max_item_scoped_custom_parameters");
        f13819r = dVar.f(7L, "measurement.rb.attribution.client.min_ad_services_version");
        f13820s = dVar.f(60000L, "measurement.alarm_manager.minimum_interval");
        f13821t = dVar.f(500L, "measurement.upload.minimum_delay");
        f13822u = dVar.f(86400000L, "measurement.monitoring.sample_period_millis");
        f13823v = dVar.g("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,com.sofascore.results,games.spearmint.triplecrush,com.block.juggle,io.supercent.linkedcubic,com.cdtg.gunsound,com.corestudios.storemanagementidle,com.cdgames.fidget3d,io.supercent.burgeridle,io.supercent.pizzaidle,jp.ne.ibis.ibispaintx.app,com.dencreak.dlcalculator,com.ebay.kleinanzeigen,de.wetteronline.wetterapp,com.game.shape.shift,com.champion.cubes,bubbleshooter.orig,com.wolt.android,com.master.hotelmaster,com.games.bus.arrival,com.playstrom.dop2,com.huuuge.casino.slots,com.ig.spider.fighting,com.jura.coloring.page,com.rikkogame.ragdoll2,com.ludo.king,com.sigma.prank.sound.haircut,com.crazy.block.robo.monster.cliffs.craft,com.fugo.wow,com.maps.locator.gps.gpstracker.phone,com.gamovation.tileclub,com.pronetis.ironball2,com.meesho.supply,pdf.pdfreader.viewer.editor.free,com.dino.race.master,com.ig.moto.racing,ai.photo.enhancer.photoclear,com.duolingo,com.candle.magic_piano,com.free.vpn.super.hotspot.open,sg.bigo.live,com.cdg.tictactoe,com.zhiliaoapp.musically.go,com.wildspike.wormszone,com.mast.status.video.edit,com.vyroai.photoeditorone,com.pujiagames.deeeersimulator,com.superbinogo.jungleboyadventure,com.trustedapp.pdfreaderpdfviewer,com.artimind.aiart.artgenerator.artavatar,de.cellular.ottohybrid,com.zeptolab.cats.google,in.crossy.daily_crossword");
        f13824w = dVar.f(10000L, "measurement.upload.realtime_upload_interval");
        f13825x = dVar.f(604800000L, "measurement.upload.refresh_blacklisted_config_interval");
        dVar.f(3600000L, "measurement.config.cache_time.service");
        f13826y = dVar.f(5000L, "measurement.service_client.idle_disconnect_millis");
        dVar.g("measurement.log_tag.service", "FA-SVC");
        f13827z = dVar.g("measurement.sgtm.app_allowlist", "de.zalando.mobile.internal,de.zalando.mobile.internal.debug,de.zalando.lounge.dev,grit.storytel.app,com.rbc.mobile.android,com.rbc.mobile.android,com.dylvian.mango.activities,com.home24.android,com.home24.android.staging,se.lf.mobile.android,se.lf.mobile.android.beta,se.lf.mobile.android.rc,se.lf.mobile.android.test,se.lf.mobile.android.test.debug,com.boots.flagship.android,com.boots.flagshiproi.android,de.zalando.mobile,com.trivago,com.getyourguide.android,es.mobail.meliarewards,se.nansen.coop.debug,se.nansen.coop,se.coop.coop.qa,com.booking,com.google.firebaseengage,com.mse.mseapp.dev,com.mse.mseapp,pl.eobuwie.eobuwieapp,br.com.eventim.mobile.app.Android,ch.ticketcorner.mobile.app.Android,de.eventim.mobile.app.Android,dk.billetlugen.mobile.app.Android,nl.eventim.mobile.app.Android,com.asos.app,com.blueshieldca.prod,dk.magnetix.tivoliapp,matas.matas.internal,nl.omoda");
        A = dVar.f(86400000L, "measurement.upload.stale_data_deletion_interval");
        B = dVar.g("measurement.rb.attribution.uri_authority", "google-analytics.com");
        C = dVar.f(1209600000L, "measurement.rb.attribution.max_queue_time");
        D = dVar.g("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion");
        E = dVar.g("measurement.rb.attribution.query_parameters_to_remove", "");
        F = dVar.g("measurement.rb.attribution.uri_scheme", "https");
        G = dVar.f(604800000L, "measurement.sdk.attribution.cache.ttl");
        H = dVar.f(7200000L, "measurement.redaction.app_instance_id.ttl");
        I = dVar.f(43200000L, "measurement.upload.backoff_period");
        J = dVar.f(15000L, "measurement.upload.initial_upload_delay_time");
        K = dVar.f(3600000L, "measurement.upload.interval");
        L = dVar.f(65536L, "measurement.upload.max_bundle_size");
        M = dVar.f(100L, "measurement.upload.max_bundles");
        N = dVar.f(500L, "measurement.upload.max_conversions_per_day");
        O = dVar.f(1000L, "measurement.upload.max_error_events_per_day");
        P = dVar.f(1000L, "measurement.upload.max_events_per_bundle");
        Q = dVar.f(100000L, "measurement.upload.max_events_per_day");
        R = dVar.f(50000L, "measurement.upload.max_public_events_per_day");
        S = dVar.f(2419200000L, "measurement.upload.max_queue_time");
        T = dVar.f(10L, "measurement.upload.max_realtime_events_per_day");
        U = dVar.f(65536L, "measurement.upload.max_batch_size");
        V = dVar.f(6L, "measurement.upload.retry_count");
        W = dVar.f(1800000L, "measurement.upload.retry_time");
        X = dVar.g("measurement.upload.url", "https://app-measurement.com/a");
        Y = dVar.f(3600000L, "measurement.upload.window_interval");
        Z = dVar.g("measurement.rb.attribution.user_properties", "_npa,npa");
    }
}
