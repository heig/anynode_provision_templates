#!version:1.0.0.1

##File header "#!version:1.0.0.1" can not be edited or deleted, and must be placed in the first line.##
## Filename: {mac}.cfg - e.g.: 00156574b150.cfg
##account.X.*:(T5XW/T54S/T48G/T48S/T46G/T46S/T29G/T46U/T48U: X ranges from 1 to 16. T52S/T42G/T42S/T43U: X ranges from 1 to 12. T41P/T41S/T27P/T27G/T41U/T42U: X ranges from 1 to 6. T40P/T40G/T23P/T23G: X ranges from 1 to 3. T21(P) E2: X ranges from 1 to 2.)##

#######################################################################################
##                                   Transfer                                        ##       
#######################################################################################
#account.1.phone_setting.call_appearance.transfer_via_new_linekey=


#######################################################################################
##                          Call Configuration                                       ##       
#######################################################################################
#account.1.music_server_uri=
#account.1.music_on_hold_type=
#account.1.auto_label.rule=
#account.1.auto_label.enable=
#account.1.number_of_linekey=
#account.1.phone_setting.call_appearance.calls_per_linekey=


################################################################
#                      Network                                ##
################################################################
static.sip.nat_stun.enable=1
static.sip.nat_stun.server=stun.eves.de
static.sip.nat_stun.port=3478


################################################################
#                      Account Register                       ##
################################################################
{% for user in ANPROV_USERS %}
{% if user.ANPROV_SUB_ID %}
account.{% $user.ANPROV_SUB_ID xml %}.enable=true
account.{% $user.ANPROV_SUB_ID xml %}.label={% $user.ANPROV_DISPLAY_NAME xml %}
account.{% $user.ANPROV_SUB_ID xml %}.display_name={% $user.ANPROV_DISPLAY_NAME xml %}
account.{% $user.ANPROV_SUB_ID xml %}.auth_name={% $user.ANPROV_AUTH_USERNAME xml %}
account.{% $user.ANPROV_SUB_ID xml %}.user_name={% $user.ANPROV_AOR_USERNAME xml %}
account.{% $user.ANPROV_SUB_ID xml %}.password={% $user.ANPROV_AUTH_PASSWORD xml %}
account.{% $user.ANPROV_SUB_ID xml %}.sip_server.1.address={% $ANPROV_SIP_HOSTNAME %}
{% if ANPROV_SIP_UDP_PORT %}
account.{% $user.ANPROV_SUB_ID xml %}.sip_server.1.port={% $ANPROV_SIP_UDP_PORT xml %}
account.{% $user.ANPROV_SUB_ID xml %}.sip_server.1.transport_type=UDP
{% end %}
{% elif ANPROV_SIP_TCP_PORT %}
account.{% $user.ANPROV_SUB_ID xml %}.sip_server.1.port={% $ANPROV_SIP_TCP_PORT xml %}
account.{% $user.ANPROV_SUB_ID xml %}.sip_server.1.transport_type=TCP
{% end %}
#account.{% $user.ANPROV_SUB_ID xml %}.sip_server.1.expires=
#account.{% $user.ANPROV_SUB_ID xml %}.sip_server.1.retry_counts=

account.{% $user.ANPROV_SUB_ID xml %}.nat.nat_traversal=1

{% end %}
	{% else %}
		{% warning no sub-id set for account %}
	{% end %}
{% end %}


#account.1.outbound_proxy_enable=
#account.1.outbound_proxy.1.address=
#account.1.outbound_proxy.1.port=


################################################################
#                      Account Basic                          ##
################################################################
#account.1.auto_answer=

################################################################
#                      Account Advanced                       ##
################################################################
#account.1.nat.udp_update_enable=
#account.1.nat.udp_update_time=
#account.1.nat.rport=

#account.1.dtmf.type=
#account.1.dtmf.info_type=
#account.1.dtmf.dtmf_payload=
#account.1.100rel_enable=
#
#account.1.subscribe_register=
#account.1.cid_source=
#account.1.enable_user_equal_phone=
#account.1.srtp_encryption=
#account.1.ptime=
#account.1.register_line=
#account.1.register_mac=
#account.1.reg_fail_retry_interval=
#account.1.unregister_on_reboot=
#
#account.1.session_timer.refresher=
#account.1.session_timer.expires=
#account.1.session_timer.enable=
#
#account.1.conf_type=
#account.1.sip_server_type=

##V83 Add
#account.1.srtp.unencrypted_rtcp.enable =
#account.1.srtp.unencrypted_rtp.enable =
#account.1.sip_server_mode =




################################################################
#                        SIP Basic config                     ##
################################################################
#account.1.contact_take_line_param=
#account.1.update_ack_while_dialing=
#account.1.srtp_lifetime=
#account.1.third_part_request_with_route.enable=
#account.1.insert_outbound_in_route.enable=
#account.1.path.enable=
#account.1.sub_fail_retry_interval=
#account.1.transfer_refer_to_contact_header.enable=
#account.1.hold_use_inactive=
#account.1.gruu.enable=
#account.1.dial_tone=
#account.1.call_id_mode=
#account.1.subscribe_expires_overlap=
#account.1.register_expires_overlap=
#account.1.call_info=
#account.1.custom_ua=
#account.1.mwi_parse_terminated=
#account.1.check_cseq.enable=
#account.1.check_to_tag.enable=
#account.1.vq_rtcpxr.collector_server_port=
#account.1.vq_rtcpxr.collector_server_host=
#account.1.vq_rtcpxr.collector_name=
#account.1.compact_header_enable=
#account.1.cp_source=
#account.1.cid_source_ppi=
#account.1.cid_source_privacy=
#account.1.reg_with_pani_header.enable =
#account.1.alert_info=
#account.1.picture_info_enable=

##V83 Add
#account.1.invite_with_pani_header.enable = 

##V84 Add
#account.1.invite_with_rpid_header.enable=

#account.1.auto_answer_mute_enable

##V84 SP4 Add
#account.1.share_line.enable_private_code =
#account.1.share_line.cancel_private_code =

#######################################################################################
##                                 History                                           ##       
#######################################################################################
#account.1.missed_calllog=


#######################################################################################  
##                                  Forward                                          ##  
####################################################################################### 
#account.1.timeout_fwd.off_code=
#account.1.timeout_fwd.on_code=
#account.1.timeout_fwd.timeout=
#account.1.timeout_fwd.target=
#account.1.timeout_fwd.enable=
#account.1.busy_fwd.off_code=
#account.1.busy_fwd.on_code=
#account.1.busy_fwd.target=
#account.1.busy_fwd.enable=
#account.1.always_fwd.off_code=
#account.1.always_fwd.on_code=
#account.1.always_fwd.target=
#account.1.always_fwd.enable=


#######################################################################################  
##                                  DND                                              ##  
#######################################################################################
#account.1.dnd.enable=
#account.1.dnd.off_code=
#account.1.dnd.on_code=



#######################################################################################  
##                               Voice Mail                                          ##  
#######################################################################################
#voice_mail.number.1=
#account.1.subscribe_mwi=
#account.1.subscribe_mwi_to_vm=
#account.1.subscribe_mwi_expires=
#account.1.display_mwi.enable=

#######################################################################################  
##                               Auto Dial                                           ##  
#######################################################################################
#account.1.auto_dial_enable=
#account.1.auto_dial_num=


#######################################################################################
##                           Preference&Status                                       ##       
#######################################################################################
#account.1.ringtone.ring_type=

#######################################################################################
##                           Digitmap                                                ##       
#######################################################################################
#account.1.dialplan.digitmap.enable=
#account.1.dialplan.digitmap.string=
#account.1.dialplan.digitmap.no_match_action=
#account.1.dialplan.digitmap.interdigit_short_timer=
#account.1.dialplan.digitmap.interdigit_long_timer=
#account.1.dialplan.digitmap.apply_to.press_send=
#account.1.dialplan.digitmap.apply_to.forward=
#account.1.dialplan.digitmap.apply_to.history_dial=
#account.1.dialplan.digitmap.apply_to.directory_dial=
#account.1.dialplan.digitmap.apply_to.on_hook_dial=
#account.1.dialplan.digitmap.active.on_hook_dialing=


#######################################################################################
##                                 Rings Settings                                    ##
#######################################################################################
#account.1.alert_info_url_enable=


#######################################################################################
##                                  BLF/BLF List                                     ##       
#######################################################################################
#account.1.blf.blf_list_uri=
#account.1.blf_list_barge_in_code=
#account.1.blf_list_code=
#account.1.blf_list_retrieve_call_parked_code=
#account.1.blf.subscribe_period=
#account.1.blf.match_host.enable=
#account.1.out_dialog_blf_enable=
#account.1.blf.subscribe_event=

##V84 Add
#account.1.blf_list_call_parked_code=
#account.1.blf_list_call_parked_list=

##V84 SP4 ADD
#account.1.blf_list_whisper_code=
#account.1.blf_list_listen_in_code=


#######################################################################################
##                                   SCA                                             ##       
#######################################################################################
#account.1.shared_line=
#account.1.line_seize.expires=
#account.1.shared_line_one_touch_bargein.enable=
#account.1.shared_line_one_touch_retrieve.enable=
#account.1.sca_manage_interface_display_time=
#account.1.shared_line_callpull_code=

##V83 Add
#account.x.share_line.barge_in.enable

###V85 add
#account.X.shared_line.idle_details=

#######################################################################################
##                                   BLA                                             ##       
#######################################################################################
#account.1.bla_number=
#account.1.bla_subscribe_period=
#account.1.bla.notify_with_expire.enable=
#account.1.bla.subscribe_uri_build_type=

#######################################################################################
##                                   Call Park                                       ##       
#######################################################################################
#account.1.callpark_enable=


#######################################################################################
##                                    Broadsoft ACD                                  ##       
#######################################################################################
#account.1.acd.enable=
#account.1.acd.available=
#account.1.acd.unavailable_reason_enable=
#account.1.acd.initial_state=
#account.1.subscribe_acd_expires=


#######################################################################################
##                                 Broadsoft ACD Call Center                         ##       
#######################################################################################
##account.X.reason_code.Y=
##account.X.reason_code_name.Y=
##account.X.bw_disp_code.Y=
##account.X.bw_disp_code_name.Y=
##account.X.supervisor_info_code.Y=
##account.X.supervisor_info_code_name.Y=
##The value Y must be continuous.

#account.1.reason_code.1=
#account.1.reason_code_name.1=
#account.1.bw_disp_code.1=
#account.1.bw_disp_code_name.1=
#account.1.supervisor_info_code.1=
#account.1.supervisor_info_code_name.1=

#######################################################################################
##                                 Broadsoft Call Center                             ##       
#######################################################################################
#account.1.call_center.call_info_enable=
#account.1.call_center.show_call_info_time=
#account.1.call_center.disp_code_enable=
#account.1.call_center.trace_enable=
#account.1.call_center.emergency_enable=
#account.1.call_center.queue_status_enable=
#account.1.call_center.queue_status_light_enable =



#######################################################################################
##                         Broadsoft Hoteling                                        ##       
#######################################################################################
#account.1.hoteling.enable=
#account.1.hoteling.user_id=
#account.1.hoteling.password=
#account.1.hoteling.expires=
#account.1.hoteling.auto_login_enable=


#######################################################################################
##                              Broadsoft XSI                                        ##       
#######################################################################################
#account.1.xsi.user =
#account.1.xsi.password =
#account.1.xsi.host =
#account.1.xsi.server_type =
#account.1.xsi.port =


#######################################################################################
##                                Call Pickup                                        ##       
#######################################################################################
#account.1.direct_pickup_code =
#account.1.group_pickup_code =
#account.1.dialoginfo_callpickup =
#account.1.refresh_remote_id.enable =


#######################################################################################
##                              Broadsoft Call Recording                             ##       
#######################################################################################
#account.1.call_recording.enable=

#######################################################################################
##                                Network Conferene                                  ##       
#######################################################################################
#account.1.conf_uri=


#######################################################################################
##                              Broadsoft Call Decline                               ##       
#######################################################################################
#account.1.features.call_decline.enable =


#######################################################################################
##                       Broadsoft Security Classification                           ##       
#######################################################################################
#account.1.security_classification.enable =



#######################################################################################
##                        Broadsoft Flexible Seating                                 ##       
#######################################################################################
#account.1.flexible_seating.enable=
#account.1.hoteling.pin=
#account.1.hoteling.mode=

#######################################################################################
##                         Features Sync                                             ##       
#######################################################################################
#account.1.features.forward.feature_key_sync.local_processing.enable=
#account.1.features.dnd.feature_key_sync.local_processing.enable =

##V84 Add
#account.1.dnd.feature_key_sync.enable=
#account.1.feature_key_sync.enable=
#account.1.forward.feature_key_sync.enable=

#######################################################################################
##                                   ACD                                             ##       
#######################################################################################
#account.1.acd.available_url=
#account.1.acd.away_url =
#account.1.acd.refresh_url =
#account.1.acd.call_information=



#######################################################################################
##                                  virtual_user                                     ##       
#######################################################################################
##V84 Add
#bw.virtual_user.1.enable=
#bw.virtual_user.1.label=
#bw.virtual_user.1.xsi.dnd.enable=
#bw.virtual_user.1.xsi.host=
#bw.virtual_user.1.xsi.password=
#bw.virtual_user.1.xsi.port=
#bw.virtual_user.1.xsi.server_type=
#bw.virtual_user.1.xsi.user=