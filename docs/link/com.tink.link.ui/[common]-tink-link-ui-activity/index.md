---
title: [common]TinkLinkUiActivity
---
//[link](../../../index.html)/[com.tink.link.ui](../index.html)/[[common]TinkLinkUiActivity](index.html)



# TinkLinkUiActivity



[common]\
class [TinkLinkUiActivity](index.html)

Activity used for displaying the full Tink Link UI flow.



Results will be passed with setResult and can be observed with the usual methods, such as onActivityResult. Possible results are [RESULT_SUCCESS](-companion/-r-e-s-u-l-t_-s-u-c-c-e-s-s.html), [RESULT_CANCELLED](-companion/-r-e-s-u-l-t_-c-a-n-c-e-l-l-e-d.html), and [RESULT_FAILURE](-companion/-r-e-s-u-l-t_-f-a-i-l-u-r-e.html).



For a [successful result](-companion/-r-e-s-u-l-t_-s-u-c-c-e-s-s.html), a [TinkLinkResult](../[common]-tink-link-result/index.html) is returned as data bundled with the key [RESULT_DATA](-companion/-r-e-s-u-l-t_-d-a-t-a.html). For a [failure result](-companion/-r-e-s-u-l-t_-f-a-i-l-u-r-e.html), a [TinkLinkError](../[common]-tink-link-error/index.html) is returned as data bundled with the key [ERROR_DATA](-companion/-e-r-r-o-r_-d-a-t-a.html). If there are credentials that could not be added as part of the Tink Link UI flow, a map of those failed credentials ids to errors will be returned as data bundled with the key [FAILED_CREDENTIALS_DATA](-companion/-f-a-i-l-e-d_-c-r-e-d-e-n-t-i-a-l-s_-d-a-t-a.html) If a [temporary user](../[common]-link-user/-temporary-user/index.html) is used for the flow, the result data is of type [TinkLinkResult.TemporaryUser](../[common]-tink-link-result/-temporary-user/index.html) which includes the authorization code (String) and the Credentials connected to the user. If a permanent user is used for the flow (either [LinkUser.ExistingUser](../[common]-link-user/-existing-user/index.html) or [LinkUser.UnauthenticatedUser](../[common]-link-user/-unauthenticated-user/index.html)), the result data is of type [TinkLinkResult.PermanentUser](../[common]-tink-link-result/-permanent-user/index.html) which includes the Credentials connected to the user.



## Samples



[common]\
tinkLinkUIExample



## Constructors


| | |
|---|---|
| [TinkLinkUiActivity](-tink-link-ui-activity.html) | [common]<br>fun [TinkLinkUiActivity](-tink-link-ui-activity.html)() |


## Types


| Name | Summary |
|---|---|
| [Companion](-companion/index.html) | [common]<br>object [Companion](-companion/index.html) |


## Functions


| Name | Summary |
|---|---|
| [onBackPressed](on-back-pressed.html) | [common]<br>open fun [onBackPressed](on-back-pressed.html)() |
| [onCreate](on-create.html) | [common]<br>open fun [onCreate](on-create.html)(savedInstanceState: &lt;ERROR CLASS&gt;?) |
| [onNewIntent](on-new-intent.html) | [common]<br>open fun [onNewIntent](on-new-intent.html)(intent: &lt;ERROR CLASS&gt;?) |

