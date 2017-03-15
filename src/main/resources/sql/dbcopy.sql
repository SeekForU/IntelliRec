# find duplicate
# select file_info_id, file_id, file_name, count(*) count from pmrs.t_file_info group by file_id having count > 1 order by file_info_id;
# find duplicate
# select file_info_id, file_id, file_name from t_file_info where file_id =
SET FOREIGN_KEY_CHECKS=0;
# category copy
insert into intelli_rec_2.t_category (category, description) select category, description from pmrs.t_category;
# actor copy
insert into intelli_rec_2.t_actor (actor_name, description) select actor_name, `desc` from pmrs.t_actor;
# director copy
insert into intelli_rec_2.t_director (director_name, description) select director_name, `desc` from pmrs.t_director;
# nation copy
insert into intelli_rec_2.t_nation (nation_name, description) select nation_name, `desc` from pmrs.t_nation;
# type copy
insert into intelli_rec_2.t_type (type_name, description) select type_name, `desc` from pmrs.t_type;
# video copy
insert into intelli_rec_2.t_video (old_id, alias, cover, duration, published, summary, video_id, download_url, video_name, youku_detail_url, youku_play_url, video_category_id, video_actioninfo_id) select file_info_id, alias, cover, duration, published, summary, file_id, download_url, file_name, youku_detail_url, youku_play_url, category, action_info from pmrs.t_file_info;
# video_actor copy
insert into intelli_rec_2.t_video_actor_link (video_id, actor_id) select file_id, actor_id from pmrs.t_file_actor;
# video_director copy
insert into intelli_rec_2.t_video_director_link (video_id, director_id) select file_id, director_id from pmrs.t_file_director;
# video_nation copy
insert into intelli_rec_2.t_video_nation_link (video_id, nation_id) select file_id, nation_id from pmrs.t_file_nation;
# video_type copy
insert into intelli_rec_2.t_video_type_link (video_id, type_id) select file_id, type_id from pmrs.t_file_type;
# user copy
insert into intelli_rec_2.t_user (email, password, user_detail_info_id, user_id, user_name, user_level, head_photo_small, head_photo_middle, head_photo_large) select email, password, details_info, user_id, user_name, user_level, head_photo_small, head_photo_middle, head_photo_large  from pmrs.t_user_profile;
# comment_record copy
insert into intelli_rec_2.t_comment_record (comment, user_comment_record_id, video_comment_record_id, comment_date) select comment, user_id, file_id, comment_date from pmrs.t_comment_record;

SET FOREIGN_KEY_CHECKS=1;