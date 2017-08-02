create index IX_5B292467 on fb_FeedBack (type_);
create index IX_88D8E446 on fb_FeedBack (uuid_);
create index IX_2F7DD822 on fb_FeedBack (uuid_, companyId);
create unique index IX_C181FF24 on fb_FeedBack (uuid_, groupId);