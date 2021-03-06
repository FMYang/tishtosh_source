package com.p683ss.android.ugc.aweme;

import com.bytedance.android.live.base.event.RoomStatusEvent;
import com.p683ss.android.sdk.webview.C19748c;
import com.p683ss.android.ugc.aweme.account.p1273f.C20968a;
import com.p683ss.android.ugc.aweme.anchor.AnchorBaseActivity;
import com.p683ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.TeenagerModeAppealActivity;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.C22745c;
import com.p683ss.android.ugc.aweme.antiaddic.p1354b.C22691a;
import com.p683ss.android.ugc.aweme.app.debug.AbsABActivity;
import com.p683ss.android.ugc.aweme.app.p1376f.C23086a;
import com.p683ss.android.ugc.aweme.base.component.EventActivityComponent;
import com.p683ss.android.ugc.aweme.base.p1411c.C23481a;
import com.p683ss.android.ugc.aweme.base.p1411c.C23483b;
import com.p683ss.android.ugc.aweme.base.p1411c.C23484c;
import com.p683ss.android.ugc.aweme.base.p1411c.C23486e;
import com.p683ss.android.ugc.aweme.base.p1411c.C23487f;
import com.p683ss.android.ugc.aweme.base.p1411c.C23488g;
import com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23684y;
import com.p683ss.android.ugc.aweme.bullet.BulletEventObserver;
import com.p683ss.android.ugc.aweme.bullet.BulletEventObserver.C24096a;
import com.p683ss.android.ugc.aweme.bullet.bridge.common.BindPhoneMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.framework.OpenAwemeDetailMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.framework.OpenFeedsFlowMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.framework.OpenLongVideoMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.framework.OpenShortVideoMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.p1473ad.GetWebViewInfo.C24121a;
import com.p683ss.android.ugc.aweme.bullet.module.base.C24316a;
import com.p683ss.android.ugc.aweme.bullet.module.base.CommonBizWebView;
import com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24296b;
import com.p683ss.android.ugc.aweme.captcha.C24483a;
import com.p683ss.android.ugc.aweme.challenge.p1494a.C24528b;
import com.p683ss.android.ugc.aweme.challenge.p1494a.C24530d;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.AddChallengeFragment;
import com.p683ss.android.ugc.aweme.comment.p1516a.C25064a;
import com.p683ss.android.ugc.aweme.commerce.challenge.C25509a;
import com.p683ss.android.ugc.aweme.commerce.p1531c.C25508a;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25615b;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25632i;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25633j;
import com.p683ss.android.ugc.aweme.commercialize.coupon.views.CouponDetailActivity;
import com.p683ss.android.ugc.aweme.commercialize.log.C26053at;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25715e;
import com.p683ss.android.ugc.aweme.commercialize.profile.C26182c;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26216b;
import com.p683ss.android.ugc.aweme.commercialize.star.C26269f;
import com.p683ss.android.ugc.aweme.commercialize.symphony.C26318i;
import com.p683ss.android.ugc.aweme.commercialize.views.C26722d;
import com.p683ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction.C26685a;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.C26690d;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.DownloadAdCardAction;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.FormAdCardAction;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.PollAdCardAction;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.SelectAdCardAction;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.TopPageAction;
import com.p683ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2;
import com.p683ss.android.ugc.aweme.commercialize.views.form.C26731a;
import com.p683ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoPlayWidget;
import com.p683ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget.C26810a;
import com.p683ss.android.ugc.aweme.common.net.C26918a;
import com.p683ss.android.ugc.aweme.common.net.C26923f;
import com.p683ss.android.ugc.aweme.compliance.business.api.p1601a.C27018a;
import com.p683ss.android.ugc.aweme.compliance.business.api.p1601a.C27019b;
import com.p683ss.android.ugc.aweme.compliance.termspp.C27086b;
import com.p683ss.android.ugc.aweme.crossplatform.p1612a.C27094a;
import com.p683ss.android.ugc.aweme.crossplatform.p1612a.C27095b;
import com.p683ss.android.ugc.aweme.crossplatform.p1612a.C27097c;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28094c;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28096d;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28108p;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28516ax;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28642ci;
import com.p683ss.android.ugc.aweme.discover.p1662v3.p1664b.C28726a;
import com.p683ss.android.ugc.aweme.discover.p1665v4.p1667ui.C28824b;
import com.p683ss.android.ugc.aweme.favorites.FavoriteListActivity;
import com.p683ss.android.ugc.aweme.favorites.p1702b.C29685a;
import com.p683ss.android.ugc.aweme.favorites.p1705ui.C29742k;
import com.p683ss.android.ugc.aweme.feed.adapter.C30088l;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30308a;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30310ab;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30311ac;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30314af;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30315ag;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30319aj;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30322am;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30323an;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30327ar;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30337f;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30339h;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30340i;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30343l;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30346o;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.C31121a;
import com.p683ss.android.ugc.aweme.feedback.C31273f;
import com.p683ss.android.ugc.aweme.festival.p1739a.C31347a;
import com.p683ss.android.ugc.aweme.flow.manager.impl.C31740d;
import com.p683ss.android.ugc.aweme.flowfeed.p1755d.C31761a;
import com.p683ss.android.ugc.aweme.flowfeed.p1755d.C31763c;
import com.p683ss.android.ugc.aweme.flowfeed.p1755d.C31765e;
import com.p683ss.android.ugc.aweme.follow.p1763b.C31869f;
import com.p683ss.android.ugc.aweme.follow.p1767ui.HeaderViewHolder;
import com.p683ss.android.ugc.aweme.follow.recommend.follow.view.C31923c;
import com.p683ss.android.ugc.aweme.following.p1770ui.C32123b;
import com.p683ss.android.ugc.aweme.forward.p1775c.C32385a;
import com.p683ss.android.ugc.aweme.forward.p1776d.C32386a;
import com.p683ss.android.ugc.aweme.forward.view.BaseAwemeDetailFragment;
import com.p683ss.android.ugc.aweme.freeflowcard.strategy.C32496e;
import com.p683ss.android.ugc.aweme.friends.p1787a.C32504a;
import com.p683ss.android.ugc.aweme.friends.p1787a.C32507d;
import com.p683ss.android.ugc.aweme.friends.p1792ui.AbsSummonFriendActivity;
import com.p683ss.android.ugc.aweme.friends.p1792ui.RecommendFriendActivity;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl.C35685v;
import com.p683ss.android.ugc.aweme.journey.C35768n;
import com.p683ss.android.ugc.aweme.journey.C35790u;
import com.p683ss.android.ugc.aweme.journey.NewUserJourneyActivity;
import com.p683ss.android.ugc.aweme.live.model.C36141b;
import com.p683ss.android.ugc.aweme.login.p1637a.C27954a;
import com.p683ss.android.ugc.aweme.longvideo.feature.NoOperateModeController;
import com.p683ss.android.ugc.aweme.longvideo.p1933a.C36349a;
import com.p683ss.android.ugc.aweme.longvideonew.C36396a;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.main.MainFragment;
import com.p683ss.android.ugc.aweme.main.MainPageFragment;
import com.p683ss.android.ugc.aweme.main.ShowPublishProcessActivity;
import com.p683ss.android.ugc.aweme.main.guide.C36659d;
import com.p683ss.android.ugc.aweme.main.p1942e.C36621d;
import com.p683ss.android.ugc.aweme.main.p1942e.C36622e;
import com.p683ss.android.ugc.aweme.main.story.C36731g;
import com.p683ss.android.ugc.aweme.miniapp.anchor.MoreElementsActivity;
import com.p683ss.android.ugc.aweme.miniapp.impl.C36894g;
import com.p683ss.android.ugc.aweme.miniapp.p1956m.C36911a;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1961a.C36952a;
import com.p683ss.android.ugc.aweme.mix.C37024f;
import com.p683ss.android.ugc.aweme.mix.C37030h;
import com.p683ss.android.ugc.aweme.mix.C37032j;
import com.p683ss.android.ugc.aweme.movie.view.C37199f;
import com.p683ss.android.ugc.aweme.newfollow.p1994a.C37837a;
import com.p683ss.android.ugc.aweme.newfollow.p1999f.C37864a;
import com.p683ss.android.ugc.aweme.newfollow.p1999f.C37865b;
import com.p683ss.android.ugc.aweme.newfollow.p2001h.C37887g;
import com.p683ss.android.ugc.aweme.newfollow.p2001h.C37896n;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.C37915b;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37954d;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C38007x;
import com.p683ss.android.ugc.aweme.notice.api.bean.C38041h;
import com.p683ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity;
import com.p683ss.android.ugc.aweme.p1426bb.p1427a.C23764a;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29906l;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29924q;
import com.p683ss.android.ugc.aweme.p1706fe.method.CloseHalfDialogBridge.C29791a;
import com.p683ss.android.ugc.aweme.p1706fe.method.CloseMethod.C29793b;
import com.p683ss.android.ugc.aweme.p1706fe.method.OpenConversationMethod;
import com.p683ss.android.ugc.aweme.p1706fe.p1707a.C29786b;
import com.p683ss.android.ugc.aweme.p1706fe.p1707a.C29787c;
import com.p683ss.android.ugc.aweme.p1807im.disableim.C33193d;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35471h;
import com.p683ss.android.ugc.aweme.p1807im.service.p1901c.C35432b;
import com.p683ss.android.ugc.aweme.policy.notice.p2079a.C39503a;
import com.p683ss.android.ugc.aweme.policy.notice.p2079a.C39504b;
import com.p683ss.android.ugc.aweme.proaccount.C39686d;
import com.p683ss.android.ugc.aweme.proaccount.C39695e;
import com.p683ss.android.ugc.aweme.profile.C39717ac;
import com.p683ss.android.ugc.aweme.profile.fansshake.C39873a;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.p2090ui.ProfileMoreFragment;
import com.p683ss.android.ugc.aweme.promote.C40743d;
import com.p683ss.android.ugc.aweme.promote.PromoteProgramDialog;
import com.p683ss.android.ugc.aweme.protection.api.p2097a.C40856a;
import com.p683ss.android.ugc.aweme.protection.gradientpunish.C40880b;
import com.p683ss.android.ugc.aweme.push.C40886c;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.aweme.qrcode.p2107v2.ScanQRCodeActivityV2;
import com.p683ss.android.ugc.aweme.setting.C41534aj;
import com.p683ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.p683ss.android.ugc.aweme.setting.p2136e.C41595a;
import com.p683ss.android.ugc.aweme.setting.p2136e.C41598d;
import com.p683ss.android.ugc.aweme.setting.personalization.p2143a.C41666a;
import com.p683ss.android.ugc.aweme.share.model.C42207a;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43890d;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43891e;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44977ao;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45087c;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45176g;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45192l;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2235c.C44593a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import com.p683ss.android.ugc.aweme.sticker.prop.fragment.StickerPropDetailFragment;
import com.p683ss.android.ugc.aweme.sticker.types.unlock.C46604b;
import com.p683ss.android.ugc.aweme.story.api.p2333a.C46621a;
import com.p683ss.android.ugc.aweme.story.model.C46656b;
import com.p683ss.android.ugc.aweme.story.p2332a.C46619a;
import com.p683ss.android.ugc.aweme.ttplatformapi.TtAuthorizeActivity;
import com.p683ss.android.ugc.aweme.unread.C47496d;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48299a.C48300a;
import com.p683ss.android.ugc.aweme.web.jsbridge.CloseJuStickerWindowMethod.C48288b;
import com.p683ss.android.ugc.aweme.web.jsbridge.DidLoadFinishMethod.C48291b;
import com.p683ss.android.ugc.vcd.C50509h;
import com.p683ss.android.websocket.p2539b.p2541b.C50823c;
import com.p683ss.android.websocket.p2539b.p2541b.C50827g;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.p2694a.C53750b;
import org.greenrobot.eventbus.p2694a.C53751c;
import org.greenrobot.eventbus.p2694a.C53752d;
import org.greenrobot.eventbus.p2694a.C53753e;

/* renamed from: com.ss.android.ugc.aweme.bj */
public final class C23829bj implements C53752d {

    /* renamed from: a */
    private static final Map<Class<?>, C53751c> f63484a = new HashMap();

    static {
        m58474a((C53751c) new C53750b(AnchorBaseActivity.class, true, new C53753e[]{new C53753e("finishCommandFromMiniApp", C25632i.class, ThreadMode.MAIN)}));
        m58474a((C53751c) new C53750b(ParentalPlatformManager.class, true, new C53753e[]{new C53753e("onParentalModeChanged", C29906l.class, ThreadMode.MAIN)}));
        m58474a((C53751c) new C53750b(TeenagerModeAppealActivity.class, true, new C53753e[]{new C53753e("onCloseAntiAddictionEvent", C40856a.class, ThreadMode.MAIN)}));
        m58474a((C53751c) new C53750b(C22745c.class, true, new C53753e[]{new C53753e("onCloseAntiAddictionEvent", C40856a.class, ThreadMode.MAIN)}));
        m58474a((C53751c) new C53750b(AbsABActivity.class, true, new C53753e[]{new C53753e("onEvent", C41595a.class)}));
        C53753e eVar = new C53753e("onPublishStatus", C43891e.class, ThreadMode.POSTING, 0, true);
        m58474a((C53751c) new C53750b(EventActivityComponent.class, true, new C53753e[]{eVar}));
        m58474a((C53751c) new C53750b(C23684y.class, true, new C53753e[]{new C53753e("onEvent", C27097c.class)}));
        m58474a((C53751c) new C53750b(BulletEventObserver.class, true, new C53753e[]{new C53753e("onEvent", C19748c.class), new C53753e("onJsBroadcastEvent", C24096a.class, ThreadMode.MAIN)}));
        m58474a((C53751c) new C53750b(BindPhoneMethod.class, true, new C53753e[]{new C53753e("onEvent", C20968a.class)}));
        m58474a((C53751c) new C53750b(OpenAwemeDetailMethod.class, true, new C53753e[]{new C53753e("onEvent", C29924q.class)}));
        m58474a((C53751c) new C53750b(OpenFeedsFlowMethod.class, true, new C53753e[]{new C53753e("onEvent", C29924q.class)}));
        m58474a((C53751c) new C53750b(OpenLongVideoMethod.class, true, new C53753e[]{new C53753e("onEvent", C27095b.class)}));
        m58474a((C53751c) new C53750b(OpenShortVideoMethod.class, true, new C53753e[]{new C53753e("onEvent", C29924q.class)}));
        m58474a((C53751c) new C53750b(C24296b.class, true, new C53753e[]{new C53753e("onEvent", C24121a.class), new C53753e("onEvent", C27094a.class)}));
        m58474a((C53751c) new C53750b(C24316a.class, true, new C53753e[]{new C53753e("onEvent", C29793b.class), new C53753e("onEvent", C35471h.class), new C53753e("onJsBroadcast", C29906l.class)}));
        m58474a((C53751c) new C53750b(CommonBizWebView.class, true, new C53753e[]{new C53753e("onJsBroadcast", C29906l.class)}));
        m58474a((C53751c) new C53750b(AddChallengeFragment.class, true, new C53753e[]{new C53753e("onChallengeReadyEvent", C24528b.class)}));
        m58474a((C53751c) new C53750b(C25509a.class, true, new C53753e[]{new C53753e("onJsBroadcast", C29906l.class, ThreadMode.MAIN), new C53753e("top", C29906l.class, ThreadMode.MAIN)}));
        m58474a((C53751c) new C53750b(C25508a.class, true, new C53753e[]{new C53753e("closeHalfDialog", C29791a.class, ThreadMode.MAIN)}));
        m58474a((C53751c) new C53750b(CouponDetailActivity.class, true, new C53753e[]{new C53753e("onEvent", C50823c.class)}));
        m58474a((C53751c) new C53750b(C26053at.class, true, new C53753e[]{new C53753e("onCommentEvent", C25064a.class), new C53753e("onDestroyBreakEvent", C30339h.class), new C53753e("onOperateEvent", C36349a.class), new C53753e("onVideoEvent", C30332aw.class)}));
        m58474a((C53751c) new C53750b(C26182c.class, true, new C53753e[]{new C53753e("top", C29906l.class, ThreadMode.MAIN)}));
        m58474a((C53751c) new C53750b(C26269f.class, true, new C53753e[]{new C53753e("onJsBroacastReceiver", C29906l.class)}));
        m58474a((C53751c) new C53750b(C26722d.class, true, new C53753e[]{new C53753e("onDidLoadFinishEvent", C48291b.class), new C53753e("onReceiveCloseJuStickerWindowEvent", C48288b.class)}));
        m58474a((C53751c) new C53750b(ProfileQuickShopContainer.class, true, new C53753e[]{new C53753e("onEvent", C35471h.class)}));
        m58474a((C53751c) new C53750b(AbsAdCardAction.class, true, new C53753e[]{new C53753e("onEvent", C26690d.class)}));
        m58474a((C53751c) new C53750b(DownloadAdCardAction.class, true, new C53753e[]{new C53753e("onEvent", C26685a.class)}));
        m58474a((C53751c) new C53750b(FormAdCardAction.class, true, new C53753e[]{new C53753e("onEvent", C26685a.class)}));
        m58474a((C53751c) new C53750b(PollAdCardAction.class, true, new C53753e[]{new C53753e("userChooseEvent", C48300a.class)}));
        m58474a((C53751c) new C53750b(SelectAdCardAction.class, true, new C53753e[]{new C53753e("userChooseEvent", C48300a.class)}));
        m58474a((C53751c) new C53750b(TopPageAction.class, true, new C53753e[]{new C53753e("onEvent", C26685a.class)}));
        m58474a((C53751c) new C53750b(C26731a.class, true, new C53753e[]{new C53753e("onEvent", C25715e.class), new C53753e("onEvent", C26690d.class), new C53753e("onEvent", C26685a.class)}));
        m58474a((C53751c) new C53750b(BottomFormDialogV2.class, true, new C53753e[]{new C53753e("onEvent", C25715e.class)}));
        m58474a((C53751c) new C53750b(AdFakeUserProfileVideoPlayWidget.class, true, new C53753e[]{new C53753e("onAdPopupWebPageEvent", C26810a.class)}));
        m58474a((C53751c) new C53750b(C28516ax.class, true, new C53753e[]{new C53753e("onMessageEvent", C28108p.class, ThreadMode.MAIN)}));
        m58474a((C53751c) new C53750b(C28642ci.class, true, new C53753e[]{new C53753e("onEvent", C28094c.class, ThreadMode.MAIN)}));
        m58474a((C53751c) new C53750b(C28726a.class, true, new C53753e[]{new C53753e("onVideoEvent", C30332aw.class)}));
        m58474a((C53751c) new C53750b(C28824b.class, true, new C53753e[]{new C53753e("onVideoEvent", C30332aw.class)}));
        m58474a((C53751c) new C53750b(FavoriteListActivity.class, true, new C53753e[]{new C53753e("onVideoEvent", C30332aw.class)}));
        m58474a((C53751c) new C53750b(C29742k.class, true, new C53753e[]{new C53753e("onStickerCollectEvent", C29685a.class)}));
        m58474a((C53751c) new C53750b(com.p683ss.android.ugc.aweme.p1706fe.method.OpenAwemeDetailMethod.class, true, new C53753e[]{new C53753e("onEvent", C29924q.class)}));
        m58474a((C53751c) new C53750b(OpenConversationMethod.class, true, new C53753e[]{new C53753e("onSelectedChatMsg", C35432b.class)}));
        m58474a((C53751c) new C53750b(com.p683ss.android.ugc.aweme.p1706fe.method.OpenFeedsFlowMethod.class, true, new C53753e[]{new C53753e("onEvent", C29924q.class)}));
        m58474a((C53751c) new C53750b(com.p683ss.android.ugc.aweme.p1706fe.method.OpenShortVideoMethod.class, true, new C53753e[]{new C53753e("onEvent", C29924q.class)}));
        m58474a((C53751c) new C53750b(C30088l.class, true, new C53753e[]{new C53753e("onFollowLiveStatusChange", RoomStatusEvent.class)}));
        m58474a((C53751c) new C53750b(C31740d.class, true, new C53753e[]{new C53753e("onEvent", C26923f.class)}));
        m58474a((C53751c) new C53750b(C31923c.class, true, new C53753e[]{new C53753e("onAnchorEvent", C30332aw.class)}));
        m58474a((C53751c) new C53750b(HeaderViewHolder.class, true, new C53753e[]{new C53753e("onEvent", C36731g.class)}));
        m58474a((C53751c) new C53750b(C32123b.class, true, new C53753e[]{new C53753e("onEvent", C47496d.class)}));
        m58474a((C53751c) new C53750b(C32386a.class, true, new C53753e[]{new C53753e("onVideoEvent", C30332aw.class)}));
        m58474a((C53751c) new C53750b(BaseAwemeDetailFragment.class, true, new C53753e[]{new C53753e("onEvent", C32385a.class), new C53753e("onReportCommentEvent", C29906l.class)}));
        C53753e eVar2 = new C53753e("onNetworkChanged", C26918a.class, ThreadMode.POSTING, 1, false);
        m58474a((C53751c) new C53750b(C32496e.class, true, new C53753e[]{eVar2}));
        m58474a((C53751c) new C53750b(AbsSummonFriendActivity.class, true, new C53753e[]{new C53753e("onEvent", C32507d.class)}));
        m58474a((C53751c) new C53750b(RecommendFriendActivity.class, true, new C53753e[]{new C53753e("onProfileFollowEvent", C24530d.class)}));
        m58474a((C53751c) new C53750b(C35685v.class, true, new C53753e[]{new C53753e("onAsyncAnchor", C25615b.class, ThreadMode.MAIN), new C53753e("onWikiActivityClose", C25633j.class, ThreadMode.MAIN)}));
        C53753e eVar3 = new C53753e("onEvent", C35768n.class, ThreadMode.MAIN, 0, true);
        m58474a((C53751c) new C53750b(NewUserJourneyActivity.class, true, new C53753e[]{eVar3, new C53753e("onEvent", C35790u.class, ThreadMode.MAIN)}));
        m58474a((C53751c) new C53750b(NoOperateModeController.class, true, new C53753e[]{new C53753e("onOperateEvent", C36349a.class)}));
        m58474a((C53751c) new C53750b(C36396a.class, true, new C53753e[]{new C53753e("onCommentEvent", C25064a.class), new C53753e("onVideoEvent", C30332aw.class)}));
        m58474a((C53751c) new C53750b(com.p683ss.android.ugc.aweme.longvideonew.feature.NoOperateModeController.class, true, new C53753e[]{new C53753e("onOperateEvent", C36349a.class)}));
        C53753e eVar4 = new C53753e("onQueryUserFinishedEvent", C23483b.class, ThreadMode.POSTING, 0, true);
        m58474a((C53751c) new C53750b(MainActivity.class, true, new C53753e[]{new C53753e("onAwesomeSplashEvent", C26216b.class), new C53753e("onEvent", C41666a.class, ThreadMode.MAIN), new C53753e("onEvent", C33193d.class, ThreadMode.MAIN), new C53753e("onEvent", C40880b.class, ThreadMode.MAIN), new C53753e("onEvent", C27019b.class, ThreadMode.MAIN), new C53753e("onEvent", C41534aj.class, ThreadMode.MAIN), new C53753e("onFeedbackEvent", C31273f.class), new C53753e("onLaunchFromAppsFlyer", C23086a.class, ThreadMode.MAIN), new C53753e("onMobEnterFromEvent", C30310ab.class), new C53753e("onMobRequestIdEvent", C30311ac.class), new C53753e("onPublishMessage", C46656b.class, ThreadMode.MAIN), eVar4, new C53753e("onScrollToDetailEvent", C30322am.class), new C53753e("onScrollToProfileEvent", C30323an.class), new C53753e("onSettingSyncDone", C41598d.class), new C53753e("onSettingsDoneEvent", C22691a.class, ThreadMode.MAIN), new C53753e("onShowPolicyNoticeDialogEvent", C39503a.class, ThreadMode.MAIN), new C53753e("onTermsConsentEvent", C27086b.class, ThreadMode.MAIN), new C53753e("onUserBannedEvent", C23486e.class, ThreadMode.MAIN), new C53753e("onUserLogicDeleteEvent", C23487f.class, ThreadMode.MAIN), new C53753e("onUserLoginStateChange", C23488g.class), new C53753e("onVideoPageChangeEvent", C30315ag.class)}));
        m58474a((C53751c) new C53750b(MainFragment.class, true, new C53753e[]{new C53753e("onAfterLoginEvent", C27954a.class), new C53753e("onAwesomeSplashEvent", C26216b.class), new C53753e("onCaptchaConsumerEvent", C24483a.class), new C53753e("onDislikeAwemeEvent", C30340i.class), new C53753e("onFollowBubbleShowEvent", C30327ar.class), new C53753e("onHideUploadRecoverEvent", C43890d.class), new C53753e("onLiveIconEntranceEnable", C30346o.class, ThreadMode.MAIN), new C53753e("onNotificationIndicatorEvent", C38041h.class, ThreadMode.MAIN), new C53753e("onPublishStatusUpdate", C43891e.class), new C53753e("onScrollToFeedFollowGuideEvent", C36659d.class), new C53753e("onSwipeRefreshInMainFragmentEvent", C36621d.class), new C53753e("onTimeLineTabEvent", C36622e.class, ThreadMode.MAIN), new C53753e("onUserLoginSuccessfully", C23488g.class), new C53753e("toggleReportButton", C26318i.class, ThreadMode.MAIN)}));
        C53753e eVar5 = new C53753e("onNotificationIndicatorEvent", C38041h.class, ThreadMode.MAIN, 0, true);
        m58474a((C53751c) new C53750b(MainPageFragment.class, true, new C53753e[]{new C53753e("onAwesomeSplashEvent", C26216b.class), new C53753e("onBackFromSettingEvent", C32504a.class, ThreadMode.MAIN), new C53753e("onCommentDialogEvent", C30337f.class), new C53753e("onComplianceDialogCheckEvent", C27018a.class), new C53753e("onDiscoverSearchEvent", C28096d.class, ThreadMode.MAIN), new C53753e("onDislikeAwemeEvent", C30340i.class), new C53753e("onEvent", C31763c.class, ThreadMode.MAIN), new C53753e("onFestivalDataEvent", C31347a.class), new C53753e("onMaintabVisibleChange", C30314af.class), new C53753e("onMobEnterFromEvent", C30310ab.class), eVar5, new C53753e("onRefreshEndEvent", C30319aj.class), new C53753e("onSafeInfoNoticeEvent", C39717ac.class, ThreadMode.MAIN), new C53753e("onScrolledToProfileTab", C42207a.class), new C53753e("onSettingSyncDone", C41598d.class, ThreadMode.MAIN), new C53753e("onShowPolicyNoticeToastEvent", C39504b.class, ThreadMode.MAIN), new C53753e("onSkylightShow", C31869f.class, ThreadMode.MAIN), new C53753e("onVideoPageChangeEvent", C30315ag.class)}));
        m58474a((C53751c) new C53750b(ShowPublishProcessActivity.class, true, new C53753e[]{new C53753e("onHideUploadRecoverEvent", C43890d.class), new C53753e("onPublishStatusUpdate", C43891e.class)}));
        m58474a((C53751c) new C53750b(MoreElementsActivity.class, true, new C53753e[]{new C53753e("finishCommandFromMiniApp", C25632i.class, ThreadMode.MAIN)}));
        m58474a((C53751c) new C53750b(C36894g.class, true, new C53753e[]{new C53753e("onEvent", C36952a.class), new C53753e("onEvent", C23764a.class)}));
        C53753e eVar6 = new C53753e("onWSStatusChange", C50827g.class, ThreadMode.POSTING, -1, false);
        m58474a((C53751c) new C53750b(C36911a.class, true, new C53753e[]{new C53753e("onReceiveMsg", C50823c.class), eVar6}));
        m58474a((C53751c) new C53750b(C37024f.class, true, new C53753e[]{new C53753e("updateCollectStatus", C37030h.class)}));
        m58474a((C53751c) new C53750b(C37032j.class, true, new C53753e[]{new C53753e("onEvent", C35471h.class), new C53753e("onFullFeedVideoChangeEvent", C31121a.class), new C53753e("onVideoEvent", C30332aw.class)}));
        m58474a((C53751c) new C53750b(C37199f.class, true, new C53753e[]{new C53753e("onVideoEvent", C30332aw.class)}));
        m58474a((C53751c) new C53750b(C37837a.class, true, new C53753e[]{new C53753e("onStoryListWidgetRefreshEvent", C46621a.class)}));
        m58474a((C53751c) new C53750b(C37864a.class, true, new C53753e[]{new C53753e("onDeleteItemEvent", C31761a.class)}));
        m58474a((C53751c) new C53750b(C37865b.class, true, new C53753e[]{new C53753e("onFollowStatusUpdate", FollowStatus.class), new C53753e("onHideUploadRecoverEvent", C43890d.class)}));
        m58474a((C53751c) new C53750b(C37915b.class, true, new C53753e[]{new C53753e("onAntiCrawlerEvent", C23481a.class), new C53753e("onEvent", C35471h.class), new C53753e("onLiveRoomScrollEvent", C36141b.class), new C53753e("onStoryPublishAnimEnd", C46619a.class), new C53753e("onVcdAuthorizeEvent", C50509h.class), new C53753e("onVoteEvent", C44593a.class)}));
        m58474a((C53751c) new C53750b(C37887g.class, true, new C53753e[]{new C53753e("onEvent", C32385a.class), new C53753e("onVideoEvent", C30332aw.class)}));
        m58474a((C53751c) new C53750b(C37896n.class, true, new C53753e[]{new C53753e("onAntiCrawlerEvent", C23481a.class)}));
        m58474a((C53751c) new C53750b(C37954d.class, true, new C53753e[]{new C53753e("onDetailPlayComplete", C30308a.class), new C53753e("onForwardResultEvent", C32385a.class)}));
        m58474a((C53751c) new C53750b(C38007x.class, true, new C53753e[]{new C53753e("onFollowLiveStatusChange", RoomStatusEvent.class), new C53753e("onUnFollowUser", C31765e.class)}));
        m58474a((C53751c) new C53750b(BaseI18nAuthorizedActivity.class, true, new C53753e[]{new C53753e("onUserBannedEvent", C23486e.class)}));
        m58474a((C53751c) new C53750b(C39686d.class, true, new C53753e[]{new C53753e("switchToBindMobile", C29786b.class, ThreadMode.MAIN), new C53753e("switchToProAccountAfterEmail", C29787c.class, ThreadMode.MAIN)}));
        m58474a((C53751c) new C53750b(C39695e.class, true, new C53753e[]{new C53753e("switchToBindMobile", C29786b.class, ThreadMode.MAIN), new C53753e("switchToProAccountAfterEmail", C29787c.class, ThreadMode.MAIN)}));
        m58474a((C53751c) new C53750b(C39873a.class, true, new C53753e[]{new C53753e("onProfileFollowEvent", C24530d.class, ThreadMode.MAIN)}));
        m58474a((C53751c) new C53750b(ProfileMoreFragment.class, true, new C53753e[]{new C53753e("onEvent", C35471h.class), new C53753e("onFollowStatusUpdate", FollowStatus.class)}));
        m58474a((C53751c) new C53750b(PromoteProgramDialog.class, true, new C53753e[]{new C53753e("closeKrCopyright", C40743d.class)}));
        m58474a((C53751c) new C53750b(CustomActionPushReceiver.class, true, new C53753e[]{new C53753e("onHideLivePopupWindowEvent", C40886c.class)}));
        m58474a((C53751c) new C53750b(ScanQRCodeActivityV2.class, true, new C53753e[]{new C53753e("onNetStateChangeEvent", C26918a.class)}));
        m58474a((C53751c) new C53750b(I18nSettingManageMyAccountActivity.class, true, new C53753e[]{new C53753e("onEmailEvent", C29906l.class)}));
        m58474a((C53751c) new C53750b(InteractStickerWidget.class, true, new C53753e[]{new C53753e("onDissmissInteractWindow", C30343l.class)}));
        m58474a((C53751c) new C53750b(C45087c.class, true, new C53753e[]{new C53753e("onAsyncAnchor", C25615b.class, ThreadMode.MAIN), new C53753e("onJsBroacastReceiver", C29906l.class, ThreadMode.MAIN)}));
        m58474a((C53751c) new C53750b(C45176g.class, true, new C53753e[]{new C53753e("onAsyncCouponInfoEvent", C29906l.class, ThreadMode.MAIN)}));
        m58474a((C53751c) new C53750b(C45192l.class, true, new C53753e[]{new C53753e("onAsyncGoodsInfoEvent", C25615b.class, ThreadMode.MAIN)}));
        m58474a((C53751c) new C53750b(C44977ao.class, true, new C53753e[]{new C53753e("onAsyncGoodsSeedInfoEvent", C29906l.class, ThreadMode.MAIN)}));
        m58474a((C53751c) new C53750b(StickerPropDetailFragment.class, true, new C53753e[]{new C53753e("onEvent", C35471h.class), new C53753e("receiveJumpMessage", C46604b.class)}));
        m58474a((C53751c) new C53750b(TtAuthorizeActivity.class, true, new C53753e[]{new C53753e("onUpdateUserEvent", C23484c.class)}));
        m58474a((C53751c) new C53750b(com.p683ss.android.ugc.aweme.web.jsbridge.OpenLongVideoMethod.class, true, new C53753e[]{new C53753e("onEvent", C27095b.class)}));
    }

    /* renamed from: a */
    private static void m58474a(C53751c cVar) {
        f63484a.put(cVar.mo112949a(), cVar);
    }

    /* renamed from: a */
    public final C53751c mo49413a(Class<?> cls) {
        C53751c cVar = (C53751c) f63484a.get(cls);
        if (cVar != null) {
            return cVar;
        }
        return null;
    }
}
